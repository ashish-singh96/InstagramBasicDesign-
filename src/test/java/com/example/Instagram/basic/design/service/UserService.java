package com.example.Instagram.basic.design.service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationTokenRepository tokenRepository;

    public String signIn(String email, String password) {
        // Perform sign-in logic, validate credentials, and generate authentication token
        // Save the token in the AuthenticationToken repository
        // Return the generated token
    }

    public String signUp(String firstName, String lastName, Integer age, String email, String phoneNumber, String password) {
        // Perform sign-up logic, create a new user, and generate authentication token
        // Save the user in the User repository
        // Save the token in the AuthenticationToken repository
        // Return the generated token
    }

    public User updateUser(Long userId, UpdateUserRequest request) {
        // Retrieve the user from the User repository
        // Update the user details
        // Save the updated user in the User repository
        // Return the updated user
    }
}

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post savePost(String postData, Long userId) {
        // Retrieve the user from the User repository based on the userId
        // Create a new post with the provided data and associate it with the user
        // Save the post in the Post repository
        // Return the saved post
    }

    public Post getPost(Integer postId) {
        // Retrieve the post from the Post repository based on the postId
        // Return the post
    }
}
