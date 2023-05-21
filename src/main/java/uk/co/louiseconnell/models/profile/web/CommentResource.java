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
import uk.co.louiseconnell.models.profile.domain.Comment;
import uk.co.louiseconnell.models.profile.service.CommentService;
import uk.co.louiseconnell.models.profile.vo.CommentVO;

@Slf4j
@Tag(name = "Comment APIs", description = "REST APISs to access or modify Comment data as a whole.")
@Path("/comments")
public class CommentResource {

  @Inject
  CommentService commentService;

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/")
    public CommentVO addAComment(
        @RequestBody(description = "Comment to add", required = true)
        @Valid CommentVO commentVO) {
        return commentService.addComment(commentVO);
    }

    @GET
  @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
  public List<Comment> getAllComments() {
    return commentService.findAllComments();
  }
}
