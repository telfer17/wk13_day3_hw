package com.codeclan.homework.repository;

import com.codeclan.homework.models.User;
import com.codeclan.homework.projections.EmbedFolderInUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolderInUser.class)
public interface UserRepository extends JpaRepository<User, Long> {

}
