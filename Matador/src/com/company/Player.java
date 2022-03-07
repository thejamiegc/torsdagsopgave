package com.company;

public class Player {
    private BankAccount account;
    private String name;
    public Player(String name,int balance){
        this.name = name;
        this.account = new BankAccount(balance);
    }

    public String getName(){
        return this.name;
    }

    public int getAccount(){
        return account.getBalance();
    }

    @Override
    public String toString(){
        return this.name + ": " + account.getBalance();
    }
}
