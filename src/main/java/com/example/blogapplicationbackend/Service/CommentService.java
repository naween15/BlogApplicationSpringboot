package com.example.blogapplicationbackend.Service;

import com.example.blogapplicationbackend.Model.CommentModel;

public interface CommentService {
    CommentModel createCommennt(Long postId,CommentModel commentModel);
    void deleteComment(Long ommentIdid);

}
