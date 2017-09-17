package com.lhyla.main;

import com.lhyla.crud.AddEmploye;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main");
		
		AddEmploye addEmploye = new AddEmploye();
		
		addEmploye.addEmploye("Lukasz", "Kowalski", "kowalski@hotmail.com");
	}

}
