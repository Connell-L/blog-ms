package uk.co.louiseconnell.models.profile.service;

import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import uk.co.louiseconnell.models.profile.domain.Reply;
import uk.co.louiseconnell.models.profile.domain.ReplyRepository;
import uk.co.louiseconnell.models.profile.vo.ReplyVO;

@Slf4j
@Transactional
@RegisterForReflection
@ApplicationScoped
public class ReplyServiceImpl implements ReplyService {

  @Inject
  ReplyRepository repository;

  @Override
  @Transactional
  public List<Reply> findAllReplies() {
    PanacheQuery<Reply> query = repository.findAllReplies();
    return Optional.ofNullable(query)
        .map(PanacheQuery::list)
        .orElse(Collections.emptyList());
  }

  @Override
  @Transactional
  public ReplyVO addReply(ReplyVO replyVO) {
    Reply reply = new Reply();
    reply.setReplyContent(replyVO.getReplyContent());
    reply.setCreatedDate(Instant.now());

    repository.persist(reply);

    return replyVO;
  }
}
