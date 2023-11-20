package com.example.SpringSecurityJWT.repositories;


import com.example.SpringSecurityJWT.models.UserEntity;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findbyUsername(String username);

    @Query("select u from UserEntity u where u.username = ?1")
    Optional<UserEntity> getName(String username);
}
