package com.codeclan.homework.repository;

import com.codeclan.homework.models.Folder;
import com.codeclan.homework.projections.EmbedForFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {

}
