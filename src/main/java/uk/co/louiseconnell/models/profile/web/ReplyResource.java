package uk.co.louiseconnell.models.profile.web;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;
import uk.co.louiseconnell.models.profile.domain.Reply;
import uk.co.louiseconnell.models.profile.service.ReplyService;
import uk.co.louiseconnell.models.profile.vo.ReplyVO;

@Slf4j
@Tag(name = "Reply APIs", description = "REST APISs to access or modify Reply data as a whole.")
@Path("/replies")
public class ReplyResource {

  @Inject
  ReplyService replyService;

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/")
  public ReplyVO addAReply(
      @RequestBody(description = "Add a reply", required = true)
      @Valid ReplyVO replyVO) {
    return replyService.addReply(replyVO);
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/")
  public List<Reply> getAllReplies() {
    return replyService.findAllReplies();
  }
}