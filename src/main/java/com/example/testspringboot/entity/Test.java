package com.example.testspringboot.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String value;

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
