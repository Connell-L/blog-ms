package uk.co.louiseconnell.models.profile.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import uk.co.louiseconnell.models.profile.domain.Post;
import uk.co.louiseconnell.models.profile.domain.PostRepository;
import uk.co.louiseconnell.models.profile.vo.PostVO;

@Slf4j
@Transactional
@RegisterForReflection
@ApplicationScoped
public class PostServiceImpl implements PostService {

  @Inject
  PostRepository repository;

  @Override
  @Transactional
  public List<Post> findAllPosts() {
    PanacheQuery<Post> query = repository.findAllPosts();
    return Optional.ofNullable(query)
        .map(PanacheQuery::list)
        .orElse(Collections.emptyList());
  }

  @Override
  @Transactional
  public PostVO addPost(PostVO postVO) {
    Post post = new Post();
    post.setTitle(postVO.getTitle());
    post.setContent(postVO.getContent());
    post.setCreatedDate(postVO.getCreatedDate());

    repository.persist(post);

    return postVO;
  }
}
