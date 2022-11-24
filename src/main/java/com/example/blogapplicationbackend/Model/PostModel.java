package com.example.blogapplicationbackend.Model;

import com.example.blogapplicationbackend.Entity.Category;
import com.example.blogapplicationbackend.Entity.Comment;
import com.example.blogapplicationbackend.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostModel {
    private Long postId;
    private String postTitle;
    private String postDescription;
    private String imageName;
    private Date addedDate;
    private CategoryModel category;
    private UserModel user;
    private List<CommentModel> comment;

}
