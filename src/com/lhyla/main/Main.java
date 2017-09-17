package com.lhyla.main;

import java.util.Scanner;

import com.lhyla.crud.AddEmploye;
import com.lhyla.crud.DeleteEmploye;
import com.lhyla.crud.ReadEmploye;
import com.lhyla.crud.UpdateEmploye;
import com.lhyla.crud.utils.GetEmployeDataFromUser;
import com.lhyla.entity.Employe;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main main()");

		Scanner scanner = new Scanner(System.in);

		GetEmployeDataFromUser getEmployeDataFromUser = new GetEmployeDataFromUser(scanner);

		// AddEmploye addEmploye = new AddEmploye();
		// addEmploye.add(getEmployeDataFromUser.getFirstName(),
		// getEmployeDataFromUser.getLastName(),
		// getEmployeDataFromUser.getEmail());

		ReadEmploye readEmploye = new ReadEmploye();
		// System.out.println(readEmploye.read(getEmployeDataFromUser.getId()));
		//
		// System.out.println("Delete employe by ID");
		// DeleteEmploye deleteEmploye = new DeleteEmploye();
		// deleteEmploye.delete(getEmployeDataFromUser.getId());

		System.out.println("Update employ by ID");
		UpdateEmploye updateEmploye = new UpdateEmploye();
		int id = getEmployeDataFromUser.getId();
		Employe employeToUpdate = readEmploye.read(id);
		System.out.println("Employe to update: " + employeToUpdate);

		System.out.println("If you leave the field blank, it will not be updated");
		System.out.println("Update first name: ");
		String firstName = getEmployeDataFromUser.getFirstName();

		System.out.println("Update last name: ");
		String lastName = getEmployeDataFromUser.getLastName();

		System.out.println("Update email: ");
		String email = getEmployeDataFromUser.getEmail();

		updateEmploye.update(id, firstName, lastName, email);

		System.out.println("End of program");

		System.out.println("Main main() scanner.close()");
		scanner.close();
	}

}
