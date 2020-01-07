package by.berdmival.derevenskoe.service.product;

import by.berdmival.derevenskoe.entity.product.Category;
import by.berdmival.derevenskoe.repository.product.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("categoryService")
@Repository
@Transactional
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public Category findById(Long categoryId) {
        return categoryRepository.findById(categoryId).get();
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getById(Long categoryId) {
        return categoryRepository.findById(categoryId).get();
    }

    @Override
    public void deleteById(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }

    @Override
    public Category update(Category category) {
        return categoryRepository.save(category);
    }
}
