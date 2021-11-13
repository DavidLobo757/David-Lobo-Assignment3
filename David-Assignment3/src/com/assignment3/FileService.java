package com.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
	
	public User[] fileReader() {
		
		UserService userService = new UserService();
		String line = "";
		User[] users = new User[4];
		BufferedReader iphoneReader = null;
		try {
			iphoneReader = new BufferedReader(new FileReader("src/data.txt"));
			int i = 0;
			while((line = iphoneReader.readLine())!= null) {
				
			//This also prints users -->	System.out.println(line);
				String[] array = line.split(",");
				users[i] = userService.createUser(array[0], array[1], array[2]);
			//This prints users in a nice form -->	System.out.println(users[i]);
				i++;
				
			}
		//	System.out.println("Users printed");
		} catch (FileNotFoundException e) {
			System.out.println("oops");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				iphoneReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return users;
	}
}
