package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor //일반생성자
@NoArgsConstructor  //기본생성자
@ToString
@Entity
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;


    @Column
    private String content;

}
