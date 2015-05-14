package com.olivermarshall.trainroutefinder.users;

/**
 * @author Oliver Marshall
 */
public class User extends DefaultUser {

    public User() {

        super();

        commands = new String[] {"help", "time", "price", "route", "split ticket", "sort routes", "admin", "end"};
    }

    public int run() {

        String command = getCommand();

        switch (command) {

            case "help":
                help();
                break;

            case "admin":
                System.out.println("Going to the admin menu.");
                return 2;

            case "end":
                return 0;

            default:
                System.out.println("Unrecognised command!");
        }
        
        return 1;
    }

    protected void help() {

        System.out.println("\nhelp            - show a list of commands and their uses");
        System.out.println("time            - something");
        System.out.println("price           - something");
        System.out.println("route           - something");
        System.out.println("split ticket    - something");
        System.out.println("sort routes     - something");
        System.out.println("admin           - switch to the admin menu");
        System.out.println("end             - exit the program\n");
    }
}
