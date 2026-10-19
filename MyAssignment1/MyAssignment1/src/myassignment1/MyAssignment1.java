/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myassignment1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class MyAssignment1{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("========== REGISTRATION ==========");

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        System.out.print("Enter Phone Number (+27): ");
        String phone = input.nextLine();

        login login = new login();


        boolean validUsername = login.checkUserName(username);
        boolean validPassword = login.checkPasswordComplexity(password);
        boolean validPhone = login.checkCellPhoneNumber(phone);


        if (validUsername) {
             System.out.println("Username successfully captured");
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        }


        if (validPassword) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted;please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }

        if (validPhone) {
           System.out.println("Cell phone number successfully added.");
        } else {System.out.println("Cell phone number incorrectly formatted or does not contain international code.");

        }


        if (validUsername && validPassword && validPhone) {
            System.out.println("Registration successful.");
            System.out.println("\n========== LOGIN ==========");
            System.out.print("Enter Username: ");
            String enteredUsername = input.nextLine();
            System.out.print("Enter Password: ");
            String enteredPassword = input.nextLine();
            
            boolean loginStatus = login.loginUser(username, password,enteredUsername,enteredPassword);

            System.out.println( login.returnLoginStatus( loginStatus,firstName, lastName) );
        } else {

            System.out.println( "Registration failed." );
        }

        input.close();
    }
}
