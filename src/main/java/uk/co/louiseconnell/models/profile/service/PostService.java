package uk.co.louiseconnell.models.profile.service;

import java.util.List;

import jakarta.transaction.Transactional;
import uk.co.louiseconnell.models.profile.domain.Post;
import uk.co.louiseconnell.models.profile.vo.PostVO;

public interface PostService {

  public List<Post> findAllPosts();

  @Transactional
  PostVO addPost(PostVO postVO);
}
