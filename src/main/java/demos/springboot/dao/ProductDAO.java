package demos.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import demos.springboot.model.Product;

public interface ProductDAO extends CrudRepository<Product, Integer>{
	
	/*
	@Query("select p from Product p where p.category.categoryId = :catId")
	List<Product> getAllByCategory(@Param("catId")int catId);
	*/
	
	List<Product> findAllByCategoryCategoryId(int categoryId);
	
	
	
}
