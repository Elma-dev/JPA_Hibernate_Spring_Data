package dev.elma.jpa_hibernate_spring_data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  //Entity
@Data   //Getters, Setters, to_string, equals and hashCode methodes
@NoArgsConstructor //Constructor without args
@AllArgsConstructor //Constructor with args
public class Product {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private int quantity;
    private double price;

}
