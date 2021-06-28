/************************************************************
 * @Purpose Implementing Address Book Problem .
 * @author Rekha
 * @version 1.0
 * @since 24/06/2021
 **************************************************************/

package com;

import java.util.List;
import java.util.Objects;

/**
 * Person is a class of public type In this Person class setting and getting
 * required values And initializing all required details has string
 *
 */

public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private String zipcode;
    private String phoneNumber;

    /*The getter method returns the value of the attribute.
    The setter method takes a parameter and assigns it to the attribute.*/
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PersonInfo{" + "firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city + ", state=" + state + ", email=" + email + ", zipcode=" + zipcode + ", phoneNumber=" + phoneNumber + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.firstName);
        hash = 29 * hash + Objects.hashCode(this.lastName);
        return hash;
    }

    /**
     * uc7: Ability to ensure there is no Duplicate Entry of the same Person in
     * a particular Address.
     * 
     * This method checks if some other Object passed
     * to it as an argument is equal to the Object on which it is invoked.
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return true;
    }

}