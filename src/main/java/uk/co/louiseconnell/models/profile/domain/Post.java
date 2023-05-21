package uk.co.louiseconnell.models.profile.domain;

import java.time.Instant;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_posts")
public class Post extends PanacheEntity {

  @Column(name = "title", length = 100, nullable = false)
  public String title;

  @Column(name = "content", length = 1000, nullable = false)
  public String content;

  @ManyToOne
  @JoinColumn(name = "user_id")
  public User user;

  @Column(name = "created_date", nullable = false)
  public Instant createdDate = Instant.now();
}
