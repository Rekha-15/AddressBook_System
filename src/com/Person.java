/************************************************************
 * @Purpose Implementing Address Book Problem .
 * -Uc1 Creating contacts for Address Book
 * @author Rekha
 * @version 1.0
 * @since 24/06/2021
 **************************************************************/

package com;

/**
 * Person is a class of public type
 * in this Person class setting and getting required values
 * initializing all required details has string
 *
 */

public class Person {
	
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public long mobileNo;
	public int zip;
	
	/**
	 * setting and getting values for Person
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param phoneNumber
	 */
	
	public Person(String firstName, String lastName, String address,String city,
		      String state, long mobileNo,int zip) {
		this.firstName = firstName;
	        this.lastName = lastName;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.mobileNo = mobileNo;
	        this.zip = zip;
	    }
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public int getPincode() {
        return zip;
    }
    
    public void setPincode(int zip) {
        this.zip = zip;
    }
    
    public long getMobileNo() {
        return mobileNo;
    }
    
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    
    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", state=" + state + ", pincode=" + zip + ", mobileNo=" + mobileNo +"]"+"\n";
    }
 }