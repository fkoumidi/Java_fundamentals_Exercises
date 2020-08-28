package Exercises_on_simple_algorithms;

import java.util.Scanner;
import java.lang.*;

public class UI_One {
    public void ui_one(){

        int choice;
        int n=0;
        long l=0;
        float y=0;
        System.out.println("Make a choice between 1-6 \n\n"+
                        "1. Calculate the factorial of a number n \n" +
                        "2. Find the maximum value of n as int so that the calculated  output is valid \n"+
                        "3. Write a program that returns true or false depending on if the number is prime or not \n"+
                        "4. Calculates the following value: 1 + ½ + ⅓ + … + 1/n \n"+
                        "5. Counts the digits of a long number \n"+
                        "6. Given a positive float number, print its decimal part\n");
        do{
            try {
                Scanner myObj = new Scanner(System.in);
                System.out.print("Enter your choice:");
                choice = myObj.nextInt();
                if (choice<1 || choice>6){
                    System.out.print("Out of range....");
                    continue;}
                break;
            } catch (Exception e) {
                System.out.print("Something went wrong....");
        }}while(true);


        if(choice<5){
            do{
                try {
                    Scanner myObj2 = new Scanner(System.in);
                    System.out.print("Give a positive integer:");
                    n= myObj2.nextInt();
                    if (n<=0){
                        System.out.print("Wrong choice....");
                        continue;}
                    break;
                } catch (Exception e) {
                    System.out.print("Something went wrong....");
                }}while(true);
        }
        else if(choice==5){
            do{
                try {
                    Scanner myObj2 = new Scanner(System.in);
                    System.out.print("Give a long number:");
                    l= myObj2.nextLong();
                    break;
                } catch (Exception e) {
                    System.out.print("Something went wrong....");
                }}while(true);
        }
        else{
            do{
                try {
                    Scanner myObj2 = new Scanner(System.in);
                    System.out.print("Give a positive float number:");
                    y= myObj2.nextFloat();
                    if (y<=0){
                        System.out.print("Wrong choice....");
                        continue;}
                    break;
                } catch (Exception e) {
                    System.out.print("Something went wrong....");
                }}while(true);
        }


        Algorithm algo = new Algorithm(n,l,y);

        switch (choice) {
            case 1:
                System.out.println("The factorial of a number "+n+ " is "+ algo.factorial());
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                if(algo.primeNumber(n))
                {System.out.println("The number"+n+" is not prime number");}
                else
                {System.out.println("The number"+n+" is prime number");}
                break;
            case 4:
                System.out.println("The result is:"+algo.calcValue());
                break;
            case 5:
                System.out.println("The digits of a number "+l+ " is "+ algo.countDigits());
                break;
            case 6:
                System.out.print("The decimal part of number "+y+" is ");
                System.out.printf("%.4f", algo.decimalPart());
                System.out.println("");
                break;

        }



    }
}
