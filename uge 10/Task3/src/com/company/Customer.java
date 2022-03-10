package com.company;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    public Customer(String firstName,String lastName,String username,int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.username=username;
        this.id = id;
    }
    @Override
    public String toString(){
        return "Firstname: " + this.firstName + "\nLastname: " + this.lastName + "\nUsername: " + username + "\nID: " + this.id;
    }
}
