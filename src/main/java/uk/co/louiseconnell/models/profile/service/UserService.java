package uk.co.louiseconnell.models.profile.service;

import java.util.List;

import jakarta.transaction.Transactional;
import uk.co.louiseconnell.models.profile.domain.User;
import uk.co.louiseconnell.models.profile.vo.UserVO;


public interface UserService {

  public List<User> findAllUsers();

  @Transactional
  UserVO addUser(UserVO userVO);

}
