package com.example.blogapplicationbackend.Model;

import com.example.blogapplicationbackend.Entity.Post;
import com.example.blogapplicationbackend.Entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter

public class CommentModel {

    private Long id;

    private String content;

}

