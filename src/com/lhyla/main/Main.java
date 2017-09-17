package com.lhyla.main;

import java.util.Scanner;

import com.lhyla.crud.AddEmploye;
import com.lhyla.crud.GetDataFromUser;
import com.lhyla.crud.ReadEmploye;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main");

		
		Scanner scanner = new Scanner(System.in);
		
		GetDataFromUser getDataFromUser = new GetDataFromUser(scanner);

//		AddEmploye addEmploye = new AddEmploye();
//		addEmploye.addEmploye(
//				getDataFromUser.getEmployeFirstName(),
//				getDataFromUser.getEmployeLastName(),
//				getDataFromUser.getEmployeEmail());
		
		ReadEmploye readEmploye = new ReadEmploye();
		
		System.out.println(readEmploye.readEmploye(getDataFromUser.getEmployeId()));
		

		scanner.close();
	}

}
