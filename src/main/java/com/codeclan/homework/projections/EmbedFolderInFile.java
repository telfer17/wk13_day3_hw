package com.codeclan.homework.projections;

import com.codeclan.homework.models.File;
import com.codeclan.homework.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolderInFile", types = File.class)
public interface EmbedFolderInFile {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
