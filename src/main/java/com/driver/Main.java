package com.driver;


public class Main {
    // we can't access any object of class in main so we have to create psvm to access
    public static void main(String[] args) {
        RWOnly Rw = new RWOnly();
        Rw.setName("Aakash");
        System.out.println(Rw.getName());
    }
}