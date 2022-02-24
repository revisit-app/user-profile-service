package io.github.revisit_app.userprofileservice.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import io.github.revisit_app.userprofileservice.entity.User;

public interface UserRepo extends ReactiveCrudRepository<User, String> {

}
