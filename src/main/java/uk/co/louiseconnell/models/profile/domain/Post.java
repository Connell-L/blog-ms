package uk.co.louiseconnell.models.profile.domain;

import java.io.Serializable;
import java.time.Instant;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
@RequiredArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "t_posts")
public class Post extends PanacheEntity implements Serializable {

  /**
   * The title of a blog post.
   */
  @NotBlank
  @Column(name = "title", length = 100, nullable = false)
  public String title;

  /**
   * The content of a blog post.
   */
  @NotBlank
  @Column(name = "content", length = 4000, nullable = false)
  public String content;

  /**
   * The date that the post was created.
   */
  @Column(name = "created_date", nullable = false)
  public Instant createdDate = Instant.now();
}
