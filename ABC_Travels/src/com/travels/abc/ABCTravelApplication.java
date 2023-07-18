package com.travels.abc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.travels.abc.user.UserController;
import com.travels.dto.User;

public class ABCTravelApplication {

	static Map<String, User> usersData = new HashMap<>();

	public static void main(String[] args) {

		FileUtility.readLogoFromFileSystem(); // step - 1 :  logo loading

		ConsoleUtilities.displayBeforeLoginConsoleMessages(); // step -2 : welcome menu /messages
 
		Scanner scannerObject = new Scanner(System.in);
		int menuId = scannerObject.nextInt();

		switch (menuId) {
		case 1: {

			printOnConsole("Doing new user registration !!!");
			User newuser = UserController.newUserRegistration();
			usersData.put(newuser.getEmailId(), newuser);

			break;
		}

		case 2: {

			printOnConsole("User Sign in performing");

			System.out.println("please enter user name (email- id)");
			String userName = scannerObject.next();
			System.out.println("please enter password !!");
			String currentpassword = scannerObject.next();
			// valid id , pw --> wlcome
			// id valid , pw --> invalid pw
			// id  --> no user exists
			
			// if (map.get(user.getMailid()) == null { syso(no user  ------------)
			
			// != null user ----------> user.getPassword() === original paword.equals(currentpassword) == true ? welcome to Abc travels : Invalid password , please try again ";

			break;
		}
		}
	}

	static void printOnConsole(String message) {
		System.out.println(message);
	}

}
