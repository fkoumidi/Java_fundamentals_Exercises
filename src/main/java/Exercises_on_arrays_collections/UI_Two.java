package Exercises_on_arrays_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UI_Two {
    public void ui_two(){

        List<Integer> list = new ArrayList<Integer>();
        int choice;
        String choice2;
        long l=0;
        int random_int;
        String s="";
        int elements;


        System.out.println("Make a choice between 1-5 \n\n"+
                "1. Given a list of integers, return a sub list that contains only the prime numbers  \n" +
                "2. Implement a way of finding a list eliminating the duplicates from a list \n"+
                "3. Write a program that returns the digits of number in descending order. \n"+
                "4. Reverse a string using only a stack \n"+
                "5. Write a program that check if a word is symmetric, ignoring cases (i.e. AbdBa is symmetric)\n");


        do{
            try {
                Scanner myObj = new Scanner(System.in);
                System.out.print("Enter your choice:");
                choice = myObj.nextInt();
                if (choice<1 || choice>5){
                    System.out.print("Out of range.Choose again:");
                    continue;}
                break;
            } catch (Exception e) {
                System.out.print("Something went wrong.Choose again:");
            }}while(true);

        if(choice==1 || choice==2){
            do{
                try {
                    Scanner myObj = new Scanner(System.in);
                    System.out.print("Press R to generate a random list of integers or M to create it manually ");
                    choice2 = myObj.nextLine();
                    choice2.toUpperCase();
                    if (!choice2.equals("R") && !choice2.equals("M")){
                        System.out.print("Press R or M....Choose again:");
                        continue;}
                    break;
                } catch (Exception e) {
                    System.out.print("Something went wrong.Choose again:");
                }}while(true);

            do{
                try {
                    Scanner myObj4 = new Scanner(System.in);
                    System.out.print("How many elements do you want the list to have? :");
                    elements= myObj4.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.print("Something went wrong.Write again:"); }
            }while(true);

            if (choice2.equals("R")) {
                for (int i = 0; i < elements; i++) {
                    Random rand = new Random();
                    int upperbound = 1000; //
                    random_int= rand.nextInt(upperbound);
                    list.add(random_int);
                }
            }
            else{
                for(int i=0;i<elements;i++) {
                    do{
                        try {
                            Scanner myObj4 = new Scanner(System.in);
                            System.out.print("Add an integer number to list:");
                            random_int= myObj4.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.print("Something went wrong.Write again:");
                        }
                    }while(true);
                    list.add(random_int);
                }
            }
        }
        else if(choice==3){
            do{
                try {
                    Scanner myObj2 = new Scanner(System.in);
                    System.out.print("Give an integer number:");
                    l= myObj2.nextLong();
                    break;
                } catch (Exception e) {
                    System.out.print("Something went wrong.Give a number again:");
                }}while(true);
        }
        else if (choice==4){
            do{
                try {
                    Scanner myObj2 = new Scanner(System.in);
                    System.out.print("Give a string:");
                    s= myObj2.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.print("Something went wrong.Write again:");
                }}while(true);
        }
        else{
            do{
                try {
                    Scanner myObj2 = new Scanner(System.in);
                    System.out.print("Give a word:");
                    s= myObj2.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.print("Something went wrong.Write again:");
                }}while(true);
        }


        switch (choice) {
            case 1:
                //System.out.println("The factorial of a number " + n + " is " + algo.factorial());
                break;
            case 2:
               // System.out.println("Tuesday");
                break;
            case 3:
               // if (algo.primeNumber()) {
               //     System.out.println("The number" + n + " is not prime number");
               // } else {
               //     System.out.println("The number" + n + " is prime number");
                //}
                break;
            case 4:
                //System.out.println("The result is:" + algo.calcValue());
                break;
            case 5:
               // System.out.println("The digits of a number " + l + " is " + algo.countDigits());
                break;
        }
    }


}
