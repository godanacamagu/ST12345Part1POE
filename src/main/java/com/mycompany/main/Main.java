package com.mycompany.main;

//import Scanner so we can get user input
import java.util.Scanner;

// create the Main class
public class Main {

    // Create scanner for the user input
    static Scanner input = new Scanner(System.in);

    // Store the registered username
    static String registeredUsername;

    // Store the registered cellphone number
    static String registeredCellphone;

    //Create the username checking method 
    public static boolean checkUserName(String username) {

        // Temporary return value
        return false;
    }

    // Create the registration method
    public static void registerUser() {

        // Registration code will be added later 
    }

    // Create the login method 
    public static boolean loginUser(String username, String passward) {

        // Temporary return value 
        return false;
    }

    // Create the login status method 
    public static String returnLoginStatus(boolean loginSccessful) {

        //Temprary return message 
        return "";

    }

    private static void checkCellPhoneNumber(String number) {

    }

    private static void checkPasswordComplexity(String password ) {

    }

    // Main method where the program starts
    public static void main(String[] args) {

        //Calls the username method 
        checkUserName("");

        // Calls the passwowrd method
        checkPasswordComplexity("");

        // Calls the cellphone method
        checkCellPhoneNumber("");

        //calls the registration method
        registerUser();

        // calls the login method 
        loginUser("", "");

        //Calls the login status method 
        returnLoginStatus(false);

    }
}
