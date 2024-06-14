/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a232_stia1123_asgn1_260511;

import java.util.Scanner;

/**
 *
 * @author mczo4
 */
public class A232_STIA1123_Asgn1_260511 {
// Alharshani Bader (260511)
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of user records = ");
        int numRecords = scanner.nextInt();
        scanner.nextLine();  // consume the newline

        BMISystem system = new BMISystem(numRecords);

        for (int i = 0; i < numRecords; i++) {
            System.out.println("Record " + (i + 1) + " :");
            System.out.print("Input user name = ");
            String name = scanner.nextLine();
            System.out.print("Input gender = ");
            String gender = scanner.nextLine();
            System.out.print("Input height in m = ");
            double height = Double.parseDouble(scanner.nextLine());
            System.out.print("Input weight in kg = ");
            double weight = Double.parseDouble(scanner.nextLine());
            system.addUser(name, gender, height, weight);
        }

        system.displayUsers();

        System.out.print("Enter a user name to be searched = ");
        String searchName = scanner.nextLine();
        system.searchUser(searchName);

        System.out.print("Enter again a user name to be searched = ");
        searchName = scanner.nextLine();
        system.searchUser(searchName);

        System.out.print("Enter a user name to be deleted = ");
        String deleteName = scanner.nextLine();
        system.deleteUser(deleteName);

        system.displayUsers();
    }
    }
    

