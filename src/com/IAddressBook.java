/************************************************************
 * @Purpose Implementing Address Book Problem .
 * @author Rekha
 * @version 1.0
 * @since 24/06/2021
 **************************************************************/

package com;

/**
 * interface class 
 * calling all functions
 *
 */

public interface IAddressBook {
	
	void add();

	void display();

	void edit();
	
	void delete(String firstName);
	
	void addMultiplePerson();
	
	void duplicateCheck(String firstName);
	

}
