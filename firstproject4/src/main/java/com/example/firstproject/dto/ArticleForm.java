package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private String title; // 제목을 받을 필드
    private String content; // 내용을 받을 필드

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
