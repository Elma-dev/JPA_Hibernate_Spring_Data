package dev.elma.jpa_hibernate_spring_data.dao;

import dev.elma.jpa_hibernate_spring_data.entities.Product;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DaoProduct extends JpaRepository<Product,Long>{
    List<Product> findByNameContains(String key);
    //Create Your Own Query
    @Query("select p from Product p where p.price between :x and :y ")
    List<Product> findWithPrice(@Param("x") Long x,@Param("y") Long y);

}
