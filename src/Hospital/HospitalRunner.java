package Hospital;

import java.util.Scanner;

public class HospitalRunner {
    public static void main(String[] args) {
        start();
    }

    static Scanner scan = new Scanner(System.in);


    private static void start() {
        System.out.println();
        System.out.println("                    ***WELCOME TO HOSPITAL***");
        System.out.println(":: FOR PATIENT (P) || FOR DOCTOR (D) || FOR ADMIN (A) || SING OUT (Q) ::");


        switch (scan.next().trim().toUpperCase()) {
            case "P":
               PatientRegisterLoginMenu.registerLoginMenu();
                break;
            case "D":
                break;
            case "A":
                break;
            case "Q":
                break;
            default:
                System.out.println("INVALID VALUE PLEASE TRY AGAIN");
                start();
        }
    }
}
