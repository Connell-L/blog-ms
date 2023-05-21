package uk.co.louiseconnell.models.profile.domain;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PostRepository implements PanacheRepository<Post> {

  public PanacheQuery<Post> findAllPosts() {
    return findAll();
  }

  public void add(Post post) {
    persist(post);
  }
}
