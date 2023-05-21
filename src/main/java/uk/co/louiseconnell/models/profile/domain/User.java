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
@Table(name = "t_users")
public class User extends PanacheEntity implements Serializable {

    /**
     * The first name of a user.
     */
    @NotBlank
    @Column(name = "first_name", length = 50)
    public String firstName;

    /**
     * The last name of a user.
     */
    @NotBlank
    @Column(name = "last_name", length = 50)
    public String lastName;

    /**
     * The email address of a user.
     */
    @NotBlank
    @Column(name = "e_mail", length = 100)
    public String email;

    /**
     * The date the user was created.
     */
    @Column(name = "created_date")
    public Instant createdDate = Instant.now();

}
