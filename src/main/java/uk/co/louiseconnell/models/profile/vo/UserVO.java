package uk.co.louiseconnell.models.profile.vo;

import java.time.Instant;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import uk.co.louiseconnell.models.profile.domain.User;

/**
 * A representation of the {@link User} entity in a simple POJO.
 */
@RegisterForReflection
@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class UserVO {

  public static final String TYPE = "UserVO";
  private final String _type = TYPE;

  /**
   * The user's first name.
   */
  private String firstName;

  /**
   * The user's last name.
   */
  private String lastName;

  /**
   * The user's email address.
   */
  private String email;

  /**
   * The user's created date.
   */
  private Instant createdDate;

}
