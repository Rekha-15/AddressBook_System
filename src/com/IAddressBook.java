/************************************************************
 * @Purpose Implementing Address Book Problem .
 * @author Rekha
 * @version 1.0
 * @since 24/06/2021
 **************************************************************/

package com;

/**
 * interface class calling all functions
 *
 */

public interface IAddressBook {

	/**
	 * Uc2: Ability to add a new contact to Address Book
	 */
	void add();

	/**
	 * Uc3: Ability to edit existing contact person using their name
	 */
	void edit();

	/**
	 * Uc4: Ability to delete a person using persons name
	 */
	void delete();

}