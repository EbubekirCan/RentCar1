package Hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) throws ParseException {

        String name = "Fatih";
        String lastName = "Akkaya";
        //int lengthUsername = 8;
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        String username = name.charAt(0) + lastName + randomNumber;

        System.out.println(username);
    }
}
