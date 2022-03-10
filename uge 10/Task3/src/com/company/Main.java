package com.company;

import java.util.ArrayList;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
	    customers.add(new Customer("Jamie","Callan","Thejamiegc",18));
        customers.add(new Customer("Frederik","Thorsen","Shrimp",1229));
        customers.add(new Customer("Max","Force","SuperMax",1));
        customers.add(new Customer("Emma","Rosa","Ems",6));
        customers.add(new Customer("Niklas","Lyng","Niknikjoystick",1231));
        customers.add(new Customer("Josefine","Jensen","osefine",1230));
        printCustomers();
    }

    static void printCustomers(){
        for (Customer i:customers) {
            System.out.println(i + "\n");
        }
    }
}
