package uk.co.louiseconnell.models.profile.vo;

import java.time.Instant;

import io.quarkus.runtime.annotations.RegisterForReflection;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import uk.co.louiseconnell.models.profile.domain.Post;
import uk.co.louiseconnell.models.profile.domain.User;

/**
 * A representation of the {@link Post} entity in a simple POJO.
 */
@RegisterForReflection
@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class PostVO {

  public static final String TYPE = "PostVO";
  private final String _type = TYPE;

  /**
   * The title of a blog post.
   */
  public String title;

  /**
   * The content of a blog post.
   */
  public String content;

  /**
   * The user who authored the blog post.
   */
  public User user;

  /**
   * The date that the post was created.
   */
  public Instant createdDate = Instant.now();
}
