package demos.springboot.service;

import java.util.List;

import demos.springboot.model.Category;

public interface CategoryService {
	
	Category getById(int id);
	
	List<Category> getAll();
	
	Category add(Category category);
	
	Category update(int categoryId, Category category);
	
	void delete(int categoryId);
	
	

}
