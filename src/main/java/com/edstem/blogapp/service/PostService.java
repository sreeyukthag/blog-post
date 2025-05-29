package com.edstem.blogapp.service;

import com.edstem.blogapp.dto.PostDTO;

import java.util.List;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);
    PostDTO getPostById(Long id);
    List<PostDTO> getAllPosts();
    void deletePost(Long id);
}
