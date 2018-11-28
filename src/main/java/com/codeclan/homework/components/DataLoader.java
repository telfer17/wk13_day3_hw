package com.codeclan.homework.components;

import com.codeclan.homework.models.File;
import com.codeclan.homework.models.Folder;
import com.codeclan.homework.models.User;
import com.codeclan.homework.repository.FileRepository;
import com.codeclan.homework.repository.FolderRepository;
import com.codeclan.homework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    private DataLoader(){

    }

    public void run(ApplicationArguments args) throws Exception {

        User david = new User("David");
        userRepository.save(david);

        Folder folder1 = new Folder("Documents", david);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Downloads", david);
        folderRepository.save(folder2);

        File file1 = new File("Logo", "png", 2000, folder1);
        fileRepository.save(file1);

        File file2 = new File("Codeclan", "txt", 1000, folder2);
        fileRepository.save(file2);

        folder1.addFile(file1);
        folderRepository.save(folder1);

        folder2.addFile(file2);
        folderRepository.save(folder2);

        david.addFolder(folder1);
        david.addFolder(folder2);
        userRepository.save(david);

    }
}
