package app.entry;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.app.dao.CategoryRepository;
import com.spring.app.dao.ProductRepository;
import com.spring.app.model.Category;
import com.spring.app.model.Product;

public class MyApp {

    @Autowired
    private ProductRepository productDao;

    @Autowired
    private CategoryRepository categoryDao;

    public void run() {

	Product manger = new Product();
	manger.setName("manger");
	productDao.save(manger);

	Product nettoyer = new Product();
	nettoyer.setName("nettoyer");
	productDao.save(nettoyer);

	List<Product> products = new ArrayList<Product>();
	products.add(manger);
	products.add(nettoyer);


	Category poisson = new Category();
	poisson.setName("Poissons");

	Category chien = new Category();
	chien.setName("Chien");


	

	poisson.setProducts(products);
	categoryDao.save(poisson);
	
	chien.setProducts(products);
	categoryDao.save(chien);

	List<Category> categories = categoryDao.findAll();
	for (Category c : categories) {
	    if (c != null) {
		System.out.println(c.getId().toString() + c.getName());
	    System.out.println(c.getProducts().get(0).getName());
	}
	}

    }

}
