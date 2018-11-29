package com.codeclan.homework.projections;

import com.codeclan.homework.models.File;
import com.codeclan.homework.models.Folder;
import com.codeclan.homework.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedForFolder", types = Folder.class)
public interface EmbedForFolder {
    User getUser();
    String getTitle();
    List<File> getFiles();
}
