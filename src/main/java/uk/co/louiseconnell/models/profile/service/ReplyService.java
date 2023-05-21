package uk.co.louiseconnell.models.profile.service;

import java.util.List;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import uk.co.louiseconnell.models.profile.domain.Reply;
import uk.co.louiseconnell.models.profile.vo.ReplyVO;

public interface ReplyService {

  List<Reply> findAllReplies();

  @Transactional
  ReplyVO addReply(@Valid ReplyVO reply);
}
