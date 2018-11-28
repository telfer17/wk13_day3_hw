package com.codeclan.homework;

import com.codeclan.homework.models.File;
import com.codeclan.homework.models.Folder;
import com.codeclan.homework.models.User;
import com.codeclan.homework.repository.FileRepository;
import com.codeclan.homework.repository.FolderRepository;
import com.codeclan.homework.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HomeworkApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateUserFoldersFiles(){

		User david = new User("David");
		userRepository.save(david);

		Folder folder1 = new Folder("Documents", david);
		folderRepository.save(folder1);

		File file1 = new File("tasks", "txt", 1000, folder1);
		fileRepository.save(file1);
	}

}
