package com.cb.demo.sqlite.repository;


import com.cb.demo.sqlite.entity.Post;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PostRepositoryTest {

  @Autowired
  private PostRepository postRepository;

  @Test
  void testSavePost() {
    LocalDateTime postCreatedAt = LocalDateTime.now();
    postRepository.save(Post.builder()
        .title("Post Title")
        .content("Content")
        .createdAt(postCreatedAt)
        .build());
  }
}