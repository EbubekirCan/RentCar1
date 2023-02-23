package Hospital;

import java.util.Scanner;

public class PatientRegisterLoginMenu extends HospitalRunner {
    static PatientRegisterPage prp = new PatientRegisterPage();
    static Scanner scan = new Scanner(System.in);

    public static void registerLoginMenu() {

        System.out.println();
        System.out.println("              ***WELCOME TO HOSPITAL***");
        System.out.println("                     LOGIN PAGE");
        System.out.println(":: FOR REGISTER (R) || FOR LOGIN (L) || SING OUT (Q) ::");

        switch (scan.next().trim().toUpperCase()) {
            case "R":
              PatientRegisterPage.register();
                PatientRegisterPage.printPatientList();
                break;
            case "L":

                break;
            case "Q":
                break;
            default:
                System.out.println("INVALID VALUE PLEASE TRY AGAIN");
                registerLoginMenu();
        }
    }
}
