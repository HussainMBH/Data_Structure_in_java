package Zoho_Coding_Test;

import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class FindcurrentTime {
    public static void main(String[] args) {
        System.out.println("Find Current Date and Time...");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));

        System.out.println("Find Current Date...");
        System.out.println(java.time.LocalDate.now());

        System.out.println("Find Current Time...");
        System.out.println(java.time.LocalTime.now());
    }
}
