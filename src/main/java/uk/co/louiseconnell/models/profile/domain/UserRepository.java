package uk.co.louiseconnell.models.profile.domain;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {

  public PanacheQuery<User> findAllUsers() {
    return findAll();
  }

  public void add(User user) {
     persist(user);
  }
}
