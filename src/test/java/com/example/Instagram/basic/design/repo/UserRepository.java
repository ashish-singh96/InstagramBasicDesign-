package com.example.Instagram.basic.design.repo;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom query methods if needed
}

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    // Add custom query methods if needed
}

@Repository
public interface AuthenticationTokenRepository extends JpaRepository<AuthenticationToken, Long> {
    // Add custom query methods if needed
}
