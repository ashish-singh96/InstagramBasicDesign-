package com.example.Instagram.basic.design.module;

public class AuthenticationToken {
    private Long tokenId;
    private String token;
    private LocalDate tokenCreationDate;
    @OneToOne
    private User user;
    // Add getters and setters
}
