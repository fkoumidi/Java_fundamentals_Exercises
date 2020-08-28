import Exercises_on_arrays_collections.UI_Two;
import Exercises_on_simple_algorithms.UI_One;

import java.util.Scanner;

public class General_UI {

    public void gen_ui() {
        boolean b=true;
        int ch;
        do {
            boolean b2=true;
            System.out.print("\nWelcome to Java Fundamentals Exercises\n" +
                    "See below the tasks:\n\n" +
                    "1.Exercises on simple algorithms\n" +
                    "2.Exercises on arrays, collections\n" +
                    "3.String class exercise\n" +
                    "Press the number(1-3) of the task you want to see:");
            do {
                try {
                    Scanner myObj = new Scanner(System.in);
                    ch = myObj.nextInt();
                    if (ch < 1 || ch > 3) {
                        System.out.print("Out of range.Choose again:");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.print("Something went wrong.Choose again:");
                }
            } while (true);

           do {
               switch (ch) {
                   case 1:
                       UI_One ui = new UI_One();
                       ui.ui_one();
                       break;
                   case 2:
                       UI_Two ui2 = new UI_Two();
                       ui2.ui_two();
                       break;
                   case 3:
                       break;
               }
               Scanner myObj = new Scanner(System.in);
               System.out.print("Press \"C\" to try again , \"M\" to change task, or anything else to exit:");
               char button = myObj.next().charAt(0);
               button = Character.toUpperCase(button);

               if (Character.toString(button).equals("C")){
                   System.out.println("");;
               }
               else if(Character.toString(button).equals("M")){
                   b2=false;
               }
               else{
                   b2=b=false;
               }

           }while(b2);

        }while(b);

        System.out.println("\nEnd of program ..thank you");
   }
}


