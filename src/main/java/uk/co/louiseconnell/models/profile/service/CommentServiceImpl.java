package uk.co.louiseconnell.models.profile.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import uk.co.louiseconnell.models.profile.domain.Comment;
import uk.co.louiseconnell.models.profile.domain.CommentRepository;
import uk.co.louiseconnell.models.profile.vo.CommentVO;

@Slf4j
@Transactional
@RegisterForReflection
@ApplicationScoped
public class CommentServiceImpl implements CommentService {

  @Inject
  CommentRepository repository;

  @Override
  @Transactional
  public List<Comment> findAllComments() {
    PanacheQuery<Comment> query = repository.findAllComments();
    return Optional.ofNullable(query)
        .map(PanacheQuery::list)
        .orElse(Collections.emptyList());
  }

  @Override
  @Transactional
   public CommentVO addComment(CommentVO commentVO) {
     Comment comment = new Comment();
     comment.setCommentContent(commentVO.getCommentContent());
     comment.setCreatedDate(commentVO.getCreatedDate());
     repository.persist(comment);
     return commentVO;
   }
}
