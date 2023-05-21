package uk.co.louiseconnell.models.profile.domain;

import java.time.Instant;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_comments")
public class Comment extends PanacheEntity {

  @Column(name = "content", length = 1000, nullable = false)
  public String content;

  @ManyToOne
  @JoinColumn(name = "user_id")
  public User user;

  @ManyToOne
  @JoinColumn(name = "post_id")
  public Post post;

  @Column(name = "created_date", nullable = false)
  public Instant createdDate = Instant.now();

}
