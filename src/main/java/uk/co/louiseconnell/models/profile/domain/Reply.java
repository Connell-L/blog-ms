package uk.co.louiseconnell.models.profile.domain;

import java.io.Serializable;
import java.time.Instant;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
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
@Table(name = "t_replies")
public class Reply extends PanacheEntity implements Serializable {

  /**
   * The content of the reply message.
   */
  @NotBlank
  @Column(name = "reply_content", length = 500)
  public String replyContent;

  /**
   * The date the reply was created.
   */
  @Column(name = "created_date", nullable = false)
  public Instant createdDate = Instant.now();

}
