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
import uk.co.louiseconnell.models.profile.domain.Post;
import uk.co.louiseconnell.models.profile.service.PostService;
import uk.co.louiseconnell.models.profile.vo.PostVO;

@Slf4j
@Tag(name = "Post APIs", description = "REST APISs to access or modify Post data as a whole.")
@Path("/posts")
public class PostResource {

  @Inject
  PostService postService;

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/")
  public PostVO addAPost(
      @RequestBody(description = "Post to add", required = true)
      @Valid PostVO postVO) {
    return postService.addPost(postVO);
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/")
  public List<Post> getAllPosts() {
    return postService.findAllPosts();
  }
}
