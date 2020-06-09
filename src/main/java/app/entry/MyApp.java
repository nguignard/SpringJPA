package app.entry;

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

	Category poisson = new Category();
	poisson.setName("Poissons");
	categoryDao.save(poisson);

	Product manger1 = new Product();
	manger1.setName("manger1");
	manger1.setCategory(poisson);
	productDao.save(manger1);

	Product manger2 = new Product();
	manger2.setName("manger2");
	manger2.setCategory(poisson);
	productDao.save(manger2);

	Category chien = new Category();
	chien.setName("Chien");
	categoryDao.save(chien);

	Product nettoyer1 = new Product();
	nettoyer1.setName("nettoyer1");
	nettoyer1.setCategory(chien);
	productDao.save(nettoyer1);

	Product nettoyer2 = new Product();
	nettoyer2.setName("nettoyer2");
	nettoyer2.setCategory(chien);
	productDao.save(nettoyer2);

	List<Category> categories = categoryDao.findAll();
	for (Category c : categories) {
	    if (c != null) {
		System.out.println("catId: " + c.getId().toString() + " catName: " + c.getName());
		for (Product p : c.getProducts()) {
	    System.out.println("product name: "+p.getName());
	}

    }

}
    }
}
