package com.example.Instagram.basic.design.controller;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<?> savePost(@RequestBody SavePostRequest request) {
        // Save post logic
        Post savedPost = postService.savePost(request.getPostData(), request.getUserId());
        return ResponseEntity.ok(savedPost);
    }

    @GetMapping("/{postId}")
    public ResponseEntity<?> getPost(@PathVariable("postId") Integer postId) {
        // Get post logic
        Post post = postService.getPost(postId);
        return ResponseEntity.ok(post);
    }
}

