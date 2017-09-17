package com.lhyla.crud;

import java.util.Scanner;

public class GetEmployeDataFromUser {

	private Scanner scanner;

	public GetEmployeDataFromUser(Scanner scanner) {
		this.scanner = scanner;
	}

	public String getFirstName() {
		System.out.println("First name: ");
		return getString();
	}

	public String getLastName() {
		System.out.println("Last name: ");
		return getString();
	}

	public String getEmail() {
		System.out.println("Email: ");
		return getString();
	}

	public int getId() {
		System.out.println("Id: ");
		return getInt();
	}

	private String getString() {
		scanner = new Scanner(System.in);
		String string = scanner.next();
		return string;
	}

	private int getInt() {
		scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
