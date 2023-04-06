package dev.elma.jpa_hibernate_spring_data;

import dev.elma.jpa_hibernate_spring_data.dao.DaoProduct;
import dev.elma.jpa_hibernate_spring_data.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JpaHibernateSpringDataApplication implements CommandLineRunner {

    @Autowired
    private DaoProduct daoProduct;
    public static void main(String[] args) {
        SpringApplication.run(JpaHibernateSpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //add Products
        daoProduct.save(new Product(null,"p1",12,1200));
        daoProduct.save(new Product(null,"p2",13,1300));
        daoProduct.save(new Product(null,"p3",14,1400));
        daoProduct.save(new Product(null,"p4",15,1500));
        //get All products
        List<Product> products=daoProduct.findAll();
        products.forEach(p->{
            System.out.println(p);
            System.out.println("----------------------------");
        });
        //searchByID
        Optional<Product> productById = daoProduct.findById(Long.valueOf(2));
        System.out.println(productById.get());
        //searcByKeyWord
        System.out.println(daoProduct.findByNameContains("3"));
        //SearchWithYourOwnQuery
        System.out.println(daoProduct.findWithPrice(Long.valueOf(1200),Long.valueOf(1500)));
    }
}
