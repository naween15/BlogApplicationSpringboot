package com.example.blogapplicationbackend.Service;

import com.example.blogapplicationbackend.Entity.Post;
import com.example.blogapplicationbackend.Model.PostModel;
import com.example.blogapplicationbackend.Payloads.PostResponse;

import java.util.List;

public interface PostService {
//create
    PostModel createPost(PostModel post,Long userId,Long categoryId);
// update
 PostModel updatePost(Long id,PostModel post);
// delete
    void deletePosts(Long id);

//    get all posts
    PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sorting,String direction);
//get post with its id
    PostModel getPostById(Long id);

    List<PostModel> getPostsByCategory(Long  categoryId);

//get post of users
    List<PostModel> getPostByUser(Long USerId);

//Search by keyword
    List<PostModel> searchPost(String keyword);

}
