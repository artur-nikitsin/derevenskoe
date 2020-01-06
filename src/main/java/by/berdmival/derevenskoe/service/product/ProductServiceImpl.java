package by.berdmival.derevenskoe.service.product;

import by.berdmival.derevenskoe.entity.product.Category;
import by.berdmival.derevenskoe.entity.product.Product;
import by.berdmival.derevenskoe.repository.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("productService")
@Repository
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveOne(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> saveSeveral(List<Product> products) {
        return productRepository.saveAll(products);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
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
    public List<Product> findByCategory(Category category) {
        return productRepository.findAllByCategory(category);
    }
}
