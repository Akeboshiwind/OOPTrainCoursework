package com.olivermarshall.trainroutefinder.users;

/**
 * @author Oliver Marshall
 */
public class Admin extends DefaultUser {

    public Admin() {

        super();

        commands = new String[] {"help", "input route", "save route", "retrieve route", "exit"};
    }

    public int run() {

        String command = getCommand();

        switch (command) {

            case "help":
                help();
                break;

            case "exit":
                System.out.println("Returning to User menu.");
                return 1;

            default:
                System.out.println("Unrecognised command!");
        }

        return 2;
    }

    protected void help() {

        System.out.println("\nhelp            - show a list of commands and their uses");
        System.out.println("input route     - something");
        System.out.println("save route      - something");
        System.out.println("retrieve route  - something");
        System.out.println("exit            - return to user view\n");
    }
}
