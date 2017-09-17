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

	public int getEmployeId() {
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
