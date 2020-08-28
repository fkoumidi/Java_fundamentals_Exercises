package Exercises_on_arrays_collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UI_Two {
    public void ui_two(){

        List<Integer> list = new ArrayList<Integer>();
        int choice;
        String choice2;
        int n=0;
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
                    System.out.print("Out of range...");
                    continue;}
                break;
            } catch (Exception e) {
                System.out.print("Something went wrong....");
            }}while(true);

        if(choice==1 || choice==2){
            do{
                try {
                    Scanner myObj = new Scanner(System.in);
                    System.out.print("Press R to generate a random list of integers or M to create it manually: ");
                    choice2 = myObj.nextLine();
                    choice2.toUpperCase();
                    if (!choice2.equals("R") && !choice2.equals("M")){
                        System.out.print("Wrong choice....");
                        continue;}
                    break;
                } catch (Exception e) {
                    System.out.print("Something went wrong...");
                }}while(true);

            do{
                try {
                    Scanner myObj4 = new Scanner(System.in);
                    System.out.print("How many elements do you want the list to have? :");
                    elements= myObj4.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.print("Something went wrong....."); }
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
                            System.out.print("Something went wrong....");
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
                    System.out.print("Give an number:");
                    n= myObj2.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.print("Something went wrong....");
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
                    System.out.print("Something went wrong...:");
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
                    System.out.print("Something went wrong....:");
                }}while(true);
        }

        Exercises2 exe = new Exercises2();

        switch (choice) {
            case 1:
                System.out.println("The initial list is: "+ list);
                System.out.println("The final list with prime numbers is:"+ exe.sublist(list));
                break;
            case 2:
                System.out.println("The initial list is: "+ list);
                System.out.println("The final list without duplicated elements is:"+ exe.elimDuplicate(list));
                break;
            case 3:
                System.out.print("The digits of number in descending order:");
                exe.desc_digits(n);
                break;
            case 4:
                System.out.print("The reversed string is:");
                exe.reserveString(s);
                break;
            case 5:
                exe.symmetricWord(s);
                break;
        }
    }


}
