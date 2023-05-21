package uk.co.louiseconnell.models.profile.service;

import org.mapstruct.Mapper;

import uk.co.louiseconnell.core.mapping.MappingConfig;
import uk.co.louiseconnell.models.profile.domain.Comment;
import uk.co.louiseconnell.models.profile.vo.CommentVO;

/**
 * Provides mapping APIs for Comments.
 */
@Mapper(config = MappingConfig.class)
public interface CommentMapper {

  /**
   * Maps a post DTO {@link Comment} to a post entity {@link CommentVO}.
   *
   * @param comment the post DTO to map
   * @return a mapped Comment
   */

    CommentVO commentToVO(Comment comment);
}
