package uk.co.louiseconnell.models.profile.service;

import java.util.List;

import jakarta.transaction.Transactional;
import uk.co.louiseconnell.models.profile.domain.Comment;
import uk.co.louiseconnell.models.profile.vo.CommentVO;

public interface CommentService {

  List<Comment> findAllComments();

  @Transactional
  CommentVO addComment(CommentVO commentVO);
}
