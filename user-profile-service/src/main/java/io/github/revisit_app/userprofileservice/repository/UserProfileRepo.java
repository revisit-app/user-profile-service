package io.github.revisit_app.userprofileservice.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import io.github.revisit_app.userprofileservice.entity.UserProfile;

public interface UserProfileRepo extends ReactiveCrudRepository<UserProfile, Long> {

}
