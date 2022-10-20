package com.company;

public class Main {

    public static void main(String[] args) {
        Bank newbank = new Bank("JavaBank");
        newbank.getPayment();
        newbank.setPayment(5);
        newbank.getPayment();
        Department first = new Department("Director");
        Department second = new Department("Sales");
        Department third = new Department("Buy");
        Department four = new Department("Accounting");
        Department five = new Department("Cleaning");
        five.setSize(2);
        five.getSize();
    }
}
