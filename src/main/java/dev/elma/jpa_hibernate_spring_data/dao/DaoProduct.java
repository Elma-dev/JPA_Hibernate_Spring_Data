package dev.elma.jpa_hibernate_spring_data.dao;

import dev.elma.jpa_hibernate_spring_data.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DaoProduct extends JpaRepository<Product,Long>{
    List<Product> findByNameContains(String key);
}
