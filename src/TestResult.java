//package test;

//import domain.Exercise;

import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.print("Введіть дату народження в таком форматі(dd mm yyyy): ");
        String strDate = in.nextLine();
        in.close();
        Exercise.Calculate(strDate);
    }
}