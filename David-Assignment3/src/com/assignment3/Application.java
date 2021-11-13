package com.assignment3;

import java.util.Scanner;

public class Application {
	private User[] users = null;
	public boolean userFound = false;
	public int loginAttempts = 0;
	public void methodOne() {
		users = new FileService().fileReader();
		// printUsers(users);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String userInputUserName = "";
		String userInputPassWord = "";
		
			while (userFound == false & loginAttempts <= 4) {
				
			// Asking for users inputs	
			System.out.println("Enter your email: ");
			userInputUserName = scanner.next();
			System.out.println("Enter your password: ");
			userInputPassWord = scanner.next();
			
			// Method to validate users
			validateUsers(userInputUserName, userInputPassWord);
			
			// Printing out when it's an invalid login
			if (userFound == false) {
				System.out.println("Invalid login, please try again");
		}
			
			loginAttempts++;
			if (loginAttempts == 5) {
				System.out.println("Too many failed login attempts, you are now locked out.");
			}
			}
		
		
	}

	private User validateUsers(String userInputUserName, String userInputPassWord) {

		
		
		for (User user : users) {
			
			if (userInputUserName.equalsIgnoreCase(user.getUserName()) & userInputPassWord.equals(user.getPassWord())) {
				System.out.println("Welcome: " + user.getName());
				userFound = true;
				return user;
			} else {
				
				
			} 
			
		} return null; 
		
	}

	@SuppressWarnings("unused")
	private void printUsers() {
		for (User user : users) {
			System.out.println(user);
		}
	}
}
