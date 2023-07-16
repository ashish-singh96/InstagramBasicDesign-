package com.example.Instagram.basic.design.controller;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signin")
    public ResponseEntity<?> signIn(@RequestBody SignInRequest request) {
        // Perform sign-in logic and return authentication token
        String token = userService.signIn(request.getEmail(), request.getPassword());
        return ResponseEntity.ok(new AuthenticationResponse(token));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody SignUpRequest request) {
        // Perform sign-up logic and return authentication token
        String token = userService.signUp(request.getFirstName(), request.getLastName(), request.getAge(), request.getEmail(), request.getPhoneNumber(), request.getPassword());
        return ResponseEntity.ok(new AuthenticationResponse(token));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<?> updateUserDetails(@PathVariable("userId") Long userId, @RequestBody UpdateUserRequest request) {
        // Update user details logic
        User updatedUser = userService.updateUser(userId, request);
        return ResponseEntity.ok(updatedUser);
    }
}

