package com.codeclan.homework.repository;

import com.codeclan.homework.models.Folder;
import com.codeclan.homework.projections.EmbedUserInFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUserInFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {

}
