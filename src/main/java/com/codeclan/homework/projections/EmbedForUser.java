package com.codeclan.homework.projections;

import com.codeclan.homework.models.Folder;
import com.codeclan.homework.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedForUser", types = User.class)
public interface EmbedForUser {
    String getName();
    List<Folder> getFolders();
}
