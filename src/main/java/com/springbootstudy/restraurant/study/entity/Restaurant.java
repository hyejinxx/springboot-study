package com.springbootstudy.restraurant.study.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Entity(name = "restaurant")
public class Restaurant {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="category")
    private Category category;
    @Column(name="create_at")
    private LocalDateTime createAt;

    public void update(Category category){
        this.category = category;
    }
    Restaurant(String name, Category category){
        this.name = name;
        this.category = category;
    }

}
