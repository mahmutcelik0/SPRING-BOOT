package com.mahmutcelik.demo1.controller;


import com.mahmutcelik.demo1.exception.PostNotFoundException;
import com.mahmutcelik.demo1.exception.UserNotFoundException;
import com.mahmutcelik.demo1.model.Post;
import com.mahmutcelik.demo1.service.post.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/post")
    private List<Post> getAllPosts() throws PostNotFoundException {
        return postService.getAllPosts();
    }

    @GetMapping("/post/{id}")
    private Post getPostById(@PathVariable Long id) throws PostNotFoundException {
        return postService.getPostById(id);
    }
}
