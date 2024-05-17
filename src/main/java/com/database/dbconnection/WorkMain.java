package com.database.dbconnection;

import javax.swing.*;

public class WorkMain {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name = "John";
        System.out.println("Hello " + name.hashCode());
        name = "Doe";
        System.out.println("Hello " + name.hashCode());

        name = JOptionPane.showInputDialog("Enter your name");
        System.out.println("Hello " + name);
        System.out.println("Hello " + name.hashCode());
    }
}
