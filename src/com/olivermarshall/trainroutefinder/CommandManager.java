package com.olivermarshall.trainroutefinder;

import com.olivermarshall.trainroutefinder.users.Admin;
import com.olivermarshall.trainroutefinder.users.User;

/**
 * @author Oliver Marshall
 */
public class CommandManager {

    public void run() {

        Boolean loop = true;
        // Used to decide which command set to use.
        // 0 to Exit the program
        // 1 for User
        // 2 for Admin
        int commandSet = 1;

        Admin admin = new Admin();
        User user = new User();

        System.out.println("Welcome to the Train Route Finder.");
        System.out.println("Type help for a list of commands.");

        while (loop) {

            switch (commandSet) {

                case 0:
                    System.out.println("Exiting!");
                    loop = false;
                    break;

                case 1:
                    commandSet = user.run();
                    break;

                case 2:
                    commandSet = admin.run();
                    break;
            }
        }
    }
}
