package demos.springboot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demos.springboot.exception.NullObjectException;
import demos.springboot.exception.ResourceNotFoundException;
import demos.springboot.model.Category;
import demos.springboot.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:4200/")
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	
	@GetMapping("/{id}")
	public Category getById(@PathVariable int id) {
		return service.getById(id);
	}

	@GetMapping
	public List<Category> getAll() {
		return service.getAll();
	}

	
	@PostMapping
	public Category add(@RequestBody Category category) {
		return service.add(category);
	}


	@PutMapping("/{id}")
	public Category update(@PathVariable int categoryId, @RequestBody Category category) {
		category.setCategoryId(categoryId);
		return service.update(categoryId, category);	
	}


	@DeleteMapping("/{id}")
	public void delete(@PathVariable int categoryId) {
		service.delete(categoryId);

	}
	

}
