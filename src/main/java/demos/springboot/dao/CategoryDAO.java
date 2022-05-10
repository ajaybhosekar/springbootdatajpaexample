package demos.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import demos.springboot.model.Category;

public interface CategoryDAO extends CrudRepository<Category, Integer>{

}
