/************************************************************
 * @Purpose Implementing Address Book Problem .
 * @author Rekha
 * @version 1.0
 * @since 24/06/2021
 **************************************************************/

package com;

import java.util.Scanner;

/**
 * Runner class is a public type Runner class contains main method if condition
 * is true By using switchCase asking user to what task user needs to perform
 * option will be given to user to select an number 
 * 1= adding contact details
 * 2=displaying contact details 
 * 3=editing contact details 
 * 4=deleting details
 * 5=search person
 */

public class Runner {

	public static void main(String[] args) {
		System.out.println("Welcome to the Address Book Problem");
		AddressBook addressbook = new AddressBook();
		boolean isExit = false;
		while (!isExit) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter options\n1.Add AddressBook\n2.Edit\n3.Delete\n4.display\n5.search\n6.Exit");
			int userInput = scanner.nextInt();
			switch (userInput) {
			case 1:

				addressbook.add();

				break;
			case 2:
				addressbook.edit();
				break;
			case 3:
				addressbook.delete();
				break;
			case 4:
				addressbook.display();
				break;
			case 5:
				UserInputData.search();

				break;
			case 6:
				isExit = true;
				break;
			default:
				System.out.println("Please enter valid input");
			}
		}
	}
}