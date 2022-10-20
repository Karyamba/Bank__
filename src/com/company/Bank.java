package com.company;

public class Bank {
    String name;

    private float payment;

    public Bank(String name) {
        this.name = name;
    }

    public void getPayment() {
        System.out.println(payment);
    }

    public float setPayment(float funds) {
        return payment += funds;
    }

}
