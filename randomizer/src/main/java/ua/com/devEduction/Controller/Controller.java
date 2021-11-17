package ua.com.devEduction.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void run(){
        System.out.println("Hello in randomizer! Choose your option:");
        boolean startProgram = true;
        try {
            while (startProgram) {
                System.out.println("Randomizer - 1\n" +
                        "Help - 2\n" +
                        "Exit - 0");
                String choose = reader.readLine();

                switch (choose){
                    case "1":
                        System.out.println("Randomizer:");
                    case "2":
                        System.out.println("Help:\n" +
                        "This program outputs random numbers every time the user enters \"n\" or \"0\" to exit\n" +
                        "Example:\n" +
                                "Enter your boundaries:\n" +
                                        "from: 1\n " +
                                        "to: 100\n" +
                                "Your random number: 3\n" +
                                "If you want to enter new boundaries enter 1 if a new number then \"n\" and 0 for exit\n" +
                                "Your choose: n\n" +
                                        "Your random number: 45\n" +
                                        "If you want to enter new boundaries enter 1 if a new number then \"n\" and 0 for exit\n" +
                                        "Your choose: 0\n" +
                                "Goodbye!\n"  + "\n" );
                        break;
                    case "0":
                        startProgram = false;
                        System.out.println("Goodbye!");
                        break;
                }
            }
        }catch (IOException e){
            System.out.println("Error!" + e.getMessage());
        }


    }

}
