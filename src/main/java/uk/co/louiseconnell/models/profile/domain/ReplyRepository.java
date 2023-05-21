package uk.co.louiseconnell.models.profile.domain;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReplyRepository implements PanacheRepository<Reply> {

    public void addReply(Reply reply) {
        persist(reply);
    }

    public PanacheQuery<Reply> findAllReplies() {
        return findAll();
    }

}
