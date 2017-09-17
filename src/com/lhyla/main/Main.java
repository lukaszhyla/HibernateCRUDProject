package com.lhyla.main;

import java.util.Scanner;

import com.lhyla.crud.AddEmploye;
import com.lhyla.crud.GetDataFromUser;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main");

		AddEmploye addEmploye = new AddEmploye();
		
		Scanner scanner = new Scanner(System.in);
		
		GetDataFromUser getDataFromUser = new GetDataFromUser(scanner);

		addEmploye.addEmploye(
				getDataFromUser.getEmployeFirstName(),
				getDataFromUser.getEmployeLastName(),
				getDataFromUser.getEmployeEmail());
		
		

		scanner.close();
	}

}
