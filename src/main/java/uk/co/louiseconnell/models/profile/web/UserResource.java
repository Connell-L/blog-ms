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
import uk.co.louiseconnell.models.profile.domain.User;
import uk.co.louiseconnell.models.profile.service.UserService;
import uk.co.louiseconnell.models.profile.vo.UserVO;

@Slf4j
@Tag(name = "User APIs", description = "REST APISs to access or modify User data as a whole.")
@Path("/users")
public class UserResource {

  @Inject
  UserService userService;

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/")
  public UserVO addAUser(
      @RequestBody(description = "User to add", required = true)
      @Valid UserVO userVO) {
    return userService.addUser(userVO);
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/")
  public List<User> getAllUsers() {
    return userService.findAllUsers();
  }
}
