package demos.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demos.springboot.dao.CategoryDAO;
import demos.springboot.dao.ProductDAO;
import demos.springboot.model.Category;
import demos.springboot.model.Product;

@SpringBootApplication
public class Springbootdemo31Application implements CommandLineRunner
{
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductDAO productDAO;

	public static void main(String[] args) {
		SpringApplication.run(Springbootdemo31Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category category1 = new Category("Electronics", "All Electronic Products");
		Category category2 = new Category("Computers", "All Computer Products");
		categoryDAO.save(category1);
		categoryDAO.save(category2);
		
		Product product1 = new Product("LED TV", "Samsung", 40000);
		product1.setCategory(category1);
		
		Product product2 = new Product("Music System", "LG", 38000);
		product2.setCategory(category1);
		
		Product product3 = new Product("Keyboard", "Intex", 4000);
		product3.setCategory(category2);
		
		Product product4 = new Product("Mouse", "Intex", 400);
		product4.setCategory(category2);
		
		productDAO.save(product1);
		productDAO.save(product2);
		productDAO.save(product3);
		productDAO.save(product4);
		
	}

}
