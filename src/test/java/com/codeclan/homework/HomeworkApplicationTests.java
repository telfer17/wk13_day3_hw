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
	public void canAddUser(){
		User user = new User("David");
		userRepository.save(user);
	}

	@Test
	public void canAddFolder() {
		User user = new User("David");
		userRepository.save(user);

		Folder folder = new Folder("Documents", user);
		folderRepository.save(folder);
	}

	@Test
	public void canAddFileAndFolder(){
		User user = new User("David");
		userRepository.save(user);

		Folder folder = new Folder("Documents", user);
		folderRepository.save(folder);

		File file = new File("Text", ".txt", 1000, folder);
		fileRepository.save(file);
	}

	@Test
	public void canHaveUserWithMultipleFolders() {
		User user = new User("David");
		userRepository.save(user);

		Folder folder1 = new Folder("Documents", user);
		folderRepository.save(folder1);

		Folder folder2 = new Folder("Downloads", user);
		folderRepository.save(folder2);

	}
}
