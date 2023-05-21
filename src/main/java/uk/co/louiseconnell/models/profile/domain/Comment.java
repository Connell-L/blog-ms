package uk.co.louiseconnell.models.profile.domain;

import java.time.Instant;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
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
@Table(name = "t_comments")
public class Comment extends PanacheEntity {

  @Column(name = "comment_content", length = 1000, nullable = false)
  public String commentContent;

  @Column(name = "created_date", nullable = false)
  public Instant createdDate = Instant.now();

}
