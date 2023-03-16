package Lesson_1;

import java.time.*;
import java.util.Scanner;

public class practic {

    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine();
        //System.out.println(now + " " + name);//(int)(2.7f)
        //System.out.printf("%s","Hello world!");
        Print(name);
        iScanner.close();
    }

    public static void Print(String name) {
        LocalTime now = LocalTime.now();
        if(now.isAfter(LocalTime.of(5,0)) && now.isBefore(LocalTime.of(23,59)))
            System.out.println("Доброе утро, "+ name);
    }
    


    private static int Inputnumber() { 
        while (true) { 
            try { 
                Scanner iScanner = new Scanner(System.in); 
                System.out.println("Введите число"); 
                int number = iScanner.nextInt(); 
                return number; 
            } catch (Exception ex) { 

                System.out.println("какое то не правильное число!"); 

            } 
        } 

    }

}
