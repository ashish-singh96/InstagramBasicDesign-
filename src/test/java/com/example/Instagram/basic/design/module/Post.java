package com.example.Instagram.basic.design.module;

import jakarta.persistence.ManyToOne;

import java.security.Timestamp;

public class Post{
    private Integer postId;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private String postData;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    // Add getters and setters
}

