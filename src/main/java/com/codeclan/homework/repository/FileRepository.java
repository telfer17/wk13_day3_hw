package com.codeclan.homework.repository;

import com.codeclan.homework.models.File;
import com.codeclan.homework.projections.EmbedForFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = EmbedForFile.class)
public interface FileRepository extends JpaRepository<File, Long> {

}
