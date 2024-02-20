/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author piyush
 */
import java.util.Scanner;
import midtermexam_versiona_extensioncode.UserProfile;

public class TestUserProfile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  available genres
        System.out.println("Available genres:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Entering User Name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // choosing genres
        System.out.print("Choose your favorite genre (enter the corresponding number): ");
        int choice = scanner.nextInt();

        // Validate genre choice
        if (choice < 1 || choice > genres.length) {
            System.out.println("Invalid choice. Please choose a number from 1 to " + genres.length);
            return;
        }

        // Create user profile
        String selectedGenre = genres[choice - 1];
        UserProfile userProfile = new UserProfile(name, selectedGenre);

        // Display confirmation message
        System.out.println("User profile created successfully: " + name + " with favorite genre: " + selectedGenre);
    }
}