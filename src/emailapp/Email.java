package emailapp;

import java.util.Scanner;

import static java.lang.Math.random;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String departrment;
    private int mailboxCapacity;
    private int defaultpasswordLength = 10;
    private String altEmail;

    //Constructor to recieve the firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        //Call a method asking for the dept - and return the dept
        this.departrment = setDeptartment();
        System.out.println("Department: " + this.departrment);

        //Call a method that returns a random password
        this.password = randomPassword(defaultpasswordLength);
        System.out.println("Your Password is: " + this.password);
    }
    //Ask for dept
    private String setDeptartment() {
        System.out.print("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int deptartmentChoice = in.nextInt();
        if(deptartmentChoice == 1) {
            return "sales";
        } else if (deptartmentChoice ==2) {
            return "development";
        } else if (deptartmentChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    //Generate rando password
    private String randomPassword(int length) {
        String passowrdSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int randomValue = (int) (Math.random() * passowrdSet.length());
            password[i] = passowrdSet.charAt(randomValue);
        }
        return new String(password);
    }


    //Set mailbox capacity

    //Set alt Email

    //Change the password
}
