package com.webdatum.backend.controller;

import com.webdatum.backend.model.Comment;
import com.webdatum.backend.repository.CommentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentRepository repo;

    public CommentController(CommentRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return repo.save(comment);
    }

    @GetMapping
    public List<Comment> getAllComments() {
        return repo.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
