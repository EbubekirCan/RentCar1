package Hospital;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static Hospital.HospitalRunner.scan;

public class PatientRegisterPage{
    static List<StaffPojo> patientList = new ArrayList<>();


    static public void register() {

        System.out.print("INPUT GENDER: ");
        String gender = scan.next();
        System.out.print("INPUT TITLE: ");
        String title = scan.next();
        System.out.print("INPUT NAME: ");
        String name = scan.next();
        System.out.print("INPUT LASTNAME: ");
        String lastName = scan.next().trim();
        System.out.print("INPUT DATE OF DAY: ");
        String dateOfDay = scan.next().trim();
        System.out.print("INPUT DATE OF MONTH: ");
        String dateOfMonth = scan.next().trim();
        System.out.print("INPUT DATE OF YEAR: ");
        String dateOfYear = scan.next().trim();
        System.out.print("INPUT NATIONAL HEALTH NUMBER: ");
        String nationalHealthNumber = scan.next();
        System.out.print("INPUT ADDRESS LINE 1 : ");
        scan.nextLine();
        String addressLine1 = scan.nextLine();
        System.out.print("INPUT ADDRESS LINE 2 : ");
        String addressLine2 = scan.nextLine();
        System.out.print("INPUT POSTCODE : ");
        String postcode = scan.nextLine();

        System.out.println();

        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        String username = name.charAt(0) + lastName + randomNumber;

        int lengthPassword = 12;
        String charsPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        Random randomPassword = new Random();
        String password = "";
        for (int i = 0; i < lengthPassword; i++) {
            password = username + charsPassword.charAt(randomPassword.nextInt(charsPassword.length()));
        }

        int lengthAccountNumber = 12;
        String charsAccountNumber = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random randomAccountNumber = new Random();
        String accountNumber = "";
        for (int i = 0; i < lengthAccountNumber; i++) {
            accountNumber = username + "/" + charsAccountNumber.charAt(randomAccountNumber.nextInt(charsAccountNumber.length()));
        }

        StaffPojo newPatient = new StaffPojo(gender,title,name,lastName,dateOfDay,dateOfMonth,dateOfYear,nationalHealthNumber,addressLine1,
                addressLine2,postcode,username,password,accountNumber);
        patientList.add(newPatient);


//        StaffPojo asd =new StaffPojo(gender,title,name,lastName,dateOfDay,dateOfMonth,
//                dateOfYear,nationalHealthNumber,addressLine1,addressLine2,postcode,username,password,accountNumber);

        System.out.println("MERHABA");





    }

    public static void printPatientList(){
        System.out.println("MERHABA");
//        System.out.printf("%-2s | %-20s | %-15s | %-10s | %-7s | %-5s \n","ID","Kitap Adı","Yazar Adı","Yayınevi","Birim Fiyat","Stok");
        System.out.printf("%-10s | %-10s | %-15s | %-15s | %-15s | %-13s | %-18s | %-18s\n","NAME","gender","titile","saf","safaw","ewqeq","213","321");
        for (StaffPojo asd : patientList) {
            System.out.printf("%-10s | %-10s | %-15s | %-15s | %-15s | %-13s | %-18s | %-18s\n",
                   asd.getGender(),asd.getTitle(),asd.getName(),asd.getLastName(),asd.getBirthDay(),
                    asd.getBirthMonth(),asd.getNationalHealthNumber(),asd.getAddressLine1() );

        }
    }

}























