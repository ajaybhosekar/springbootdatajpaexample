package demos.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demos.springboot.model.Category;
import demos.springboot.service.CategoryService;
import demos.springboot.dao.CategoryDAO;
import demos.springboot.exception.NullObjectException;
import demos.springboot.exception.ResourceNotFoundException;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDAO categoryDAO;
	

	@Override
	public Category getById(int id) {
		Category category = null;
		Optional<Category> opt = categoryDAO.findById(id);
		if(opt.isEmpty()) {
			throw new ResourceNotFoundException("Category", "Category Id", id);
		}
		else {
			category = opt.get();
		}
		return category;
		
	}

	@Override
	public List<Category> getAll() {
		List<Category> categories = new ArrayList<Category>();
		Iterable<Category> it = categoryDAO.findAll();
		it.forEach((category) -> {
			categories.add(category);
		});
		return categories;
	}

	@Override
	public Category add(Category category) {
		if(category == null) {
			throw new NullObjectException("Category");
		}
		return categoryDAO.save(category);
	}

	@Override
	public Category update(int categoryId, Category category) {
		if(category == null) {
			throw new NullObjectException("Category");
		}
		
		Optional<Category> opt = categoryDAO.findById(categoryId);
		if(opt.isEmpty()) {
			throw new ResourceNotFoundException("Category", "Category Id", categoryId);
		}
		Category cat = categoryDAO.save(category);
		
		return cat;	
	}

	@Override
	public void delete(int categoryId) {
		Optional<Category> opt = categoryDAO.findById(categoryId);
		if(opt.isEmpty()) {
			throw new ResourceNotFoundException("Category", "Category Id", categoryId);
		}
		categoryDAO.delete(new Category(categoryId,"",""));

	}

}
