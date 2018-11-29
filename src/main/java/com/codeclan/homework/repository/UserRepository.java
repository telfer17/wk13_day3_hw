package com.codeclan.homework.repository;

import com.codeclan.homework.models.User;
import com.codeclan.homework.projections.EmbedForUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForUser.class)
public interface UserRepository extends JpaRepository<User, Long> {

}
