package com.olivermarshall.trainroutefinder.users;

import java.util.Scanner;

/**
 * @author Oliver Marshall
 */
public class DefaultUser {

    protected Scanner scanner;
    protected String[] commands;

    DefaultUser() {

        scanner = new Scanner(System.in);
    }

    protected String getCommand() {

        System.out.print(">");

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

}
