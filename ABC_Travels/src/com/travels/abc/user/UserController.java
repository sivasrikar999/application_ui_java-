package com.travels.abc.user;

import java.util.Scanner;

import com.travels.dto.User;

public class UserController {

	public static User newUserRegistration() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first name ");
		String firstName = sc.next();
		System.out.println("Please enter last name ");
		String lastName = sc.next();
		System.out.println("Please enter mobile Number ");
		String mobileNum = sc.next();

		while (mobileNum.length() != 10) {
			System.out.println("Mobile number is invalid please enter again !!");
			mobileNum = sc.next();
		}

		System.out.println("please enter gender Male / FeMale");

		String gender = sc.next();

		System.out.println("please enter email id");

		String mail = sc.next();

		System.out.println("Please enter password");

		String password = sc.next();

		User userObj = new User(firstName, lastName, mobileNum, mail, password);
		userObj.setAccountStatus("Active");

		return userObj;

	}

}
