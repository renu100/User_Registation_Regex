package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner scanner = new Scanner(System.in);

	// create method for First name
	public static void validFirstName() {

		System.out.println("Enter First Name:");
		String name = scanner.next();
		String regex = "^[A-Z]{1}[a-z]*";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean r = m.matches();

		if (r)
			System.out.println("First name is valid");
		else
			System.out.println("First name is !Invalid");

	}

	// create method for last name
	public static void validLastName() {

		System.out.println("Enter Last Name:");
		String lname = scanner.next();
		String regex = "^[A-Z]{1}[a-z]{2,}$";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lname);
		boolean r = m.matches();

		if (r)
			System.out.println("Last name is valid");
		else
			System.out.println("Last name is !Invalid");

	}

	// create method for Email id
	public static void validEmail() {

		System.out.println("Enter E-mail:");
		String email = scanner.next();

		String regex = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
		;

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		boolean r = m.matches();

		if (r)
			System.out.println("Valid Email address");
		else
			System.out.println("Email address is !Invalid");

	}

	// create method for mobile number
	public static void validMobileNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your mobile number : ");
		String phoneNo = scanner.nextLine();
		String regex3 = "(91|0)?\\s?[6-9][0-9]{9}$";
		Pattern p3 = Pattern.compile(regex3);
		Matcher m3 = p3.matcher(phoneNo);
		boolean r3 = m3.matches();
		if (r3)
			System.out.println("Phone number is Valid");
		else
			System.out.println("Phone number is !Invalid");
	}

	// create method for password minimum 8 characters needed
	public static void validPasswordRule1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Password at least eight charecter : ");
		String passWord = scanner.nextLine();
		String regex4 = "^[A-Z a-z 0-9]{8,}$";
		Pattern p4 = Pattern.compile(regex4);
		Matcher m4 = p4.matcher(passWord);
		boolean r4 = m4.matches();
		if (r4)
			System.out.println("Password is Valid");
		else
			System.out.println("Password is !Invalid");
	}

	// create method for password Should have at least 1Upper Case
	public static void validPasswordRule2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Password at least one Upper Case & eight charecter :");
		String passWord1 = scanner.nextLine();
		String regex5 = "^[A-Z]{1}+[a-zA-z0-9]{7,}$";
		Pattern p5 = Pattern.compile(regex5);
		Matcher m5 = p5.matcher(passWord1);
		boolean r5 = m5.matches();
		if (r5)
			System.out.println("Password is Valid");
		else
			System.out.println("Password is !Invalid");
	}

}