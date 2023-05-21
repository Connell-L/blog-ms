package uk.co.louiseconnell.models.profile.service;

import org.mapstruct.Mapper;

import jakarta.enterprise.context.ApplicationScoped;
import uk.co.louiseconnell.core.mapping.MappingConfig;
import uk.co.louiseconnell.models.profile.domain.User;
import uk.co.louiseconnell.models.profile.vo.UserVO;

/**
 * Provides mapping APIs.
 */

@Mapper(config = MappingConfig.class)
public interface UserMapper {

  /**
   * Maps a user entity {@link User} to a user DTO {@link UserVO}.
   *
   * @param user the user entity to map
   * @return a mapped RightVO
   */
  UserVO userToVO(User user);

    /**
     * Maps a user DTO {@link UserVO} to a user entity {@link User}.
     *
     * @param userVO the user DTO to map
     * @return a mapped Right
     */
    User toUser(UserVO userVO);


}
