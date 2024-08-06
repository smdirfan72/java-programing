import java.util.Scanner;

public class CollegeUserDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Total users and staff users
        System.out.print("Enter the total number of users: ");
        int totalUsers = scanner.nextInt();
        System.out.print("Enter the number of staff users: ");
        int staffUsers = scanner.nextInt();

        // Calculate the number of non-teaching staff users
        int nonTeachingStaffUsers = staffUsers / 3;

        // Calculate the number of student users
        int studentUsers = totalUsers - staffUsers - nonTeachingStaffUsers;

        // Output the results
        System.out.println("Total Users: " + totalUsers);
        System.out.println("Staff Users: " + staffUsers);
        System.out.println("Non-Teaching Staff Users: " + nonTeachingStaffUsers);
        System.out.println("Student Users: " + studentUsers);

        scanner.close();
    }
}