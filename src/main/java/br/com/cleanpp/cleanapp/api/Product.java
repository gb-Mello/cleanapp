package br.com.cleanpp.cleanapp.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

    @Id
    private String id;
    private String name;
    private String image;
    private int rating;

    public Product() {
    }

    
    public Product(String id, String name, String image, int rating) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getImage() {
        return image;
    }
    public int getRating() {
        return rating;
    } 
}
