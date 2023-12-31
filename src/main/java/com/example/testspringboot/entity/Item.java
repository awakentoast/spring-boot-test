package com.example.testspringboot.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Getter
@Setter
@ToString
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private boolean available;

    @JsonBackReference(value = "Product -> Items")
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    @JsonBackReference(value = "Status' -> Item")
    @ManyToOne
    @JoinColumn(name = "itemId")
    private Status status;
}
