package uk.co.louiseconnell.models.profile.service;

import org.mapstruct.Mapper;

import uk.co.louiseconnell.core.mapping.MappingConfig;
import uk.co.louiseconnell.models.profile.domain.Reply;
import uk.co.louiseconnell.models.profile.vo.ReplyVO;

/**
 * Provides mapping APIs for Replies.
 */

@Mapper(config = MappingConfig.class)
public interface ReplyMapper {

  /**
   * Maps a user entity {@link Reply} to a user DTO {@link ReplyVO}.
   *
   * @param reply the user entity to map
   * @return a mapped ReplyVO
   */

    ReplyVO replyToVO(Reply reply);

}
