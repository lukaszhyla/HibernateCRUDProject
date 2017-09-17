package com.lhyla.main;

import java.util.Scanner;

import com.lhyla.crud.AddEmploye;
import com.lhyla.crud.DeleteEmploye;
import com.lhyla.crud.GetEmployeDataFromUser;
import com.lhyla.crud.ReadEmploye;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main main()");

		
		Scanner scanner = new Scanner(System.in);
		
		GetEmployeDataFromUser getEmployeDataFromUser = new GetEmployeDataFromUser(scanner);

		AddEmploye addEmploye = new AddEmploye();
		addEmploye.add(
				getEmployeDataFromUser.getFirstName(),
				getEmployeDataFromUser.getLastName(),
				getEmployeDataFromUser.getEmail());
		
		
		ReadEmploye readEmploye = new ReadEmploye();
		System.out.println(readEmploye.read(getEmployeDataFromUser.getId()));
		
		
		System.out.println("Delete employe by ID");
		DeleteEmploye deleteEmploye = new DeleteEmploye();
		deleteEmploye.delete(getEmployeDataFromUser.getId());
		
		
		System.out.println("End of program");
		
		System.out.println("Main main() scanner.close()");
		scanner.close();
	}

}
