package uk.co.louiseconnell.models.profile.domain;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CommentRepository implements PanacheRepository<Comment> {

  public PanacheQuery<Comment> findAllComments() {
    return findAll();
  }

    public void add(Comment comment) {
         persist(comment);
    }
}
