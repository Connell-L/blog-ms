package uk.co.louiseconnell.models.profile.service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import uk.co.louiseconnell.models.profile.domain.User;
import uk.co.louiseconnell.models.profile.domain.UserRepository;
import uk.co.louiseconnell.models.profile.vo.UserVO;


@Slf4j
@Transactional
@RegisterForReflection
@ApplicationScoped
public class UserServiceImpl implements UserService {


  @Inject
  UserRepository repository;

  @Override
  @Transactional
  public List<User> findAllUsers() {
    PanacheQuery<User> query = repository.findAllUsers();
    return Optional.ofNullable(query)
        .map(PanacheQuery::list)
        .orElse(Collections.emptyList());
  }



  @Override
  @Transactional
  public UserVO addUser(UserVO userVO) {
    User user = new User();
    user.setFirstName(userVO.getFirstName());
    user.setLastName(userVO.getLastName());
    user.setEmail(userVO.getEmail());
    user.setCreatedDate(Instant.now());

    repository.persist(user);

    return userVO;
  }






}
