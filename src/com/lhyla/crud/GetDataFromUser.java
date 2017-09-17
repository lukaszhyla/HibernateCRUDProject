package com.lhyla.crud;

import java.util.Scanner;

public class GetDataFromUser {

	private Scanner scanner;

	public GetDataFromUser(Scanner scanner) {
		this.scanner = scanner;
	}

	public String getEmployeFirstName() {
		System.out.println("First name: ");
		return getString();
	}

	public String getEmployeLastName() {
		System.out.println("Last name: ");
		return getString();
	}

	public String getEmployeEmail() {
		System.out.println("Email: ");
		return getString();
	}

	private String getString() {
		scanner = new Scanner(System.in);
		String string = scanner.next();
		return string;
	}
}
