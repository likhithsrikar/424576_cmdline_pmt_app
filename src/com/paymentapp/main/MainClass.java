package com.paymentapp.main;

import com.paymentapp.actions.BankAccActions;
import com.paymentapp.actions.UserActions;
import com.paymentapp.admin.Admin;
import com.paymentapp.appdata.AppData;
import com.paymentapp.user.UserDetails;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        AppData appData = new AppData(); 
        UserActions userActions = new UserActions(appData.getAllUsers());
        Admin admin = new Admin(appData); 
        while (true) {
            System.out.println("\n--- Welcome to Payment App ---");
            System.out.println("1. User");
            System.out.println("2. Admin");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int role = scanner.nextInt();
            scanner.nextLine(); 
            switch (role) {
                case 1:
                                                  
                    userFlow(scanner, userActions, appData);
                    break;

                case 2:
                    
                    adminFlow(scanner, admin);
                    break;

                case 3:
                    
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    
    private static void userFlow(Scanner scanner, UserActions userActions, AppData appData) {
        while (true) {
            System.out.println("\n--- User Menu ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Go Back");
            System.out.print("Enter your choice: ");
            int userChoice = scanner.nextInt();
            scanner.nextLine(); 

            switch (userChoice) {
                case 1:
                    
                    System.out.print("Enter username: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();

                    userActions.registerUser(userName, password, firstName, lastName, phoneNumber, address);
                    break;

                case 2:
                   
                    System.out.print("Enter username: ");
                    String loginUserName = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = scanner.nextLine();

                    UserDetails loggedInUser = userActions.loginUser(loginUserName, loginPassword);
                    if (loggedInUser != null) {
                        System.out.println("Login successful! Welcome, " + loggedInUser.getUserName());

                       
                        BankAccActions bankAccActions = new BankAccActions(loggedInUser);

                        
                        while (true) {
                            System.out.println("\n--- Bank Account Menu ---");
                            System.out.println("1. Check Balance");
                            System.out.println("2. Check Status");
                            System.out.println("3. Go Back");
                            System.out.print("Enter your choice: ");
                            int bankChoice = scanner.nextInt();
                            scanner.nextLine(); 
                            switch (bankChoice) {
                                case 1:
                                   
                                    System.out.print("Enter Bank Account ID: ");
                                    int bankAccountId = scanner.nextInt();
                                    scanner.nextLine(); 
                                    bankAccActions.checkBalance(bankAccountId);
                                    break;

                                case 2:
                                   
                                    System.out.print("Enter Bank Account ID: ");
                                    int statusAccountId = scanner.nextInt();
                                    scanner.nextLine(); 
                                    bankAccActions.checkStatus(statusAccountId);
                                    break;

                                case 3:
                                    
                                    System.out.println("Returning to User Menu...");
                                    break;

                                default:
                                    System.out.println("Invalid choice. Please try again.");
                            }

                            if (bankChoice == 3) {
                                break; 
                            }
                        }
                    }
                    break;

                case 3:
                    
                    System.out.println("Returning to Main Menu...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    
    private static void adminFlow(Scanner scanner, Admin admin) {
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Display All Users");
            System.out.println("2. Go Back");
            System.out.print("Enter your choice: ");
            int adminChoice = scanner.nextInt();
            scanner.nextLine(); 

            switch (adminChoice) {
                case 1:
                    
                    admin.displayAllUsers();
                    break;

                case 2:
                   
                    System.out.println("Returning to Main Menu...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}