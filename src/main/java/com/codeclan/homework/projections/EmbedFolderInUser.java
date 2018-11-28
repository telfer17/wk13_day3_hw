package com.codeclan.homework.projections;

import com.codeclan.homework.models.Folder;
import com.codeclan.homework.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolderInUser", types = User.class)
public interface EmbedFolderInUser {
    String getName();
    List<Folder> getFolders();
}
