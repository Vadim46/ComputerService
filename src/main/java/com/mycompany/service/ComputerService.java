package com.mycompany.service;


import jakarta.persistence.*;

@Entity
@Table(name = "computer_service_t")
public class ComputerService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name_f" , nullable = false)
    private String name;

    @Column(name="price_f" , nullable = false)
    private Double price;

    public ComputerService() {
        name = "";
        price = 0.0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
