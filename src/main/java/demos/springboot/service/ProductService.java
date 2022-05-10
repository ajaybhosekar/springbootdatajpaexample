package demos.springboot.service;

import java.util.List;

import demos.springboot.model.Product;

public interface ProductService {

	List<Product> getAll();
	
	List<Product> getAllByCategory(int categoryId);

	Product getById(int id);

	Product add(int categoryId, Product p);

	Product update(int productId, Product p);

	void delete(int productId);

}