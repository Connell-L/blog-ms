package uk.co.louiseconnell.models.profile.vo;

import java.time.Instant;

import io.quarkus.runtime.annotations.RegisterForReflection;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import uk.co.louiseconnell.models.profile.domain.Reply;

/**
 * A representation of the {@link Reply} entity in a simple POJO.
 */

@RegisterForReflection
@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class ReplyVO {

  public static final String TYPE = "ReplyVO";
  private final String _type = TYPE;

  /**
   * The content of the reply message.
   */
  public String replyContent;

  /**
   * The date the reply was created.
   */
  public Instant createdDate = Instant.now();
}
