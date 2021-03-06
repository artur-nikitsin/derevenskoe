package by.berdmival.derevenskoe.service.product;

import by.berdmival.derevenskoe.entity.product.Category;
import by.berdmival.derevenskoe.entity.product.Product;
import by.berdmival.derevenskoe.exception.product.ProductNotFoundByIdException;
import by.berdmival.derevenskoe.repository.product.ProductRepository;
import by.berdmival.derevenskoe.util.FileManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;

@Service("productService")
@Repository
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private FileManager fileManager;

    @Value("${upload.products}")
    private String productsDir;

    @Override
    public Product save(Product product) {
        product.setEnabled(true);
        product.setAdvisable(true);
        product.setPictures(new ArrayList<>());
        if (product.getCoefficient() == 0.0) {
            product.setCoefficient(1.0);
        }
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundByIdException(id));
    }

    @Override
    public void deleteOneById(Long id) throws NoSuchFileException {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new ProductNotFoundByIdException(id)
        );

        if ((product.getCategory() != null)) {
            product.getCategory().getProducts().remove(product);
        }

        List<String> images = product.getPictures();

        if (images != null && !images.isEmpty()) {
            for (String imageName : images
            ) {
                fileManager.deleteImage(
                        productsDir,
                        Long.toString(id),
                        imageName
                );
            }
        }

        productRepository.deleteById(id);
    }

    @Override
    public Page<Product> findByCategory(Category category, Pageable pageable) {
        return productRepository.findAllByCategory(category, pageable);
    }
}
