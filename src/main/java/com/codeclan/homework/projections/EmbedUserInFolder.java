package com.codeclan.homework.projections;

import com.codeclan.homework.models.File;
import com.codeclan.homework.models.Folder;
import com.codeclan.homework.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUserInFolder", types = Folder.class)
public interface EmbedUserInFolder {
    User getUser();
    String getTitle();
    List<File> getFiles();
}
