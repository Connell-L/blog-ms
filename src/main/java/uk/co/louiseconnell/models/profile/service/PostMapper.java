package uk.co.louiseconnell.models.profile.service;

import org.mapstruct.Mapper;

import uk.co.louiseconnell.core.mapping.MappingConfig;
import uk.co.louiseconnell.models.profile.domain.User;
import uk.co.louiseconnell.models.profile.vo.PostVO;
import uk.co.louiseconnell.models.profile.domain.Post;

/**
 * Provides mapping APIs for Posts.
 */
@Mapper(config = MappingConfig.class)
public interface PostMapper {

  /**
   * Maps a post DTO {@link Post} to a post entity {@link PostVO}.
   *
   * @param post the post DTO to map
   * @return a mapped Post
   */
    PostVO postToVO(Post post);
}
