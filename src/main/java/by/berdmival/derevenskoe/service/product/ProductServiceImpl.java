package by.berdmival.derevenskoe.service.product;

import by.berdmival.derevenskoe.entity.product.Category;
import by.berdmival.derevenskoe.entity.product.Product;
import by.berdmival.derevenskoe.repository.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("productService")
@Repository
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        product.setEnabled(true);
        product.setAdvisable(true);
        product.setPictures(new ArrayList<>());
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> saveSeveral(List<Product> products) {
        return productRepository.saveAll(products);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void deleteOne(Product product) {
        productRepository.delete(product);
    }

    @Override
    public void deleteOneById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Page<Product> findByCategory(Category category, Pageable pageable) {
        return productRepository.findAllByCategory(category, pageable);
    }
}
