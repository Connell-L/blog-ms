package uk.co.louiseconnell.models.profile.vo;

import java.time.Instant;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@RegisterForReflection
@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class CommentVO {

  public static final String TYPE = "CommentVO";
  private final String _type = TYPE;

  private String commentContent;

  private Instant createdDate;

}
