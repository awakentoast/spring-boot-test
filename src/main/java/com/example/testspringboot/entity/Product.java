package com.example.testspringboot.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<Item> items;
//    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
//    private List<Image> images;


    public void setName(String name) {
        this.name = name + "12345";
    }
}
