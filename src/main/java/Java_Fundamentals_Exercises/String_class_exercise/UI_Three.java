package Java_Fundamentals_Exercises.String_class_exercise;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class UI_Three {
    String str;
    Boolean b=true;

    public void ui_three() {
        do {int count=0;
            Scanner myObj = new Scanner(System.in);
            System.out.print("\nEnter your password:");
            str = myObj.nextLine();
            //str="Mgh6ph111@";
            Password pw = new Password(str);
            Message ms =new Message();

            List<Boolean> list = new ArrayList<>(Arrays.asList(pw.lowercase(), pw.identicalChars(), pw.number(), pw.specialChar(), pw.uppercase()));
            for (Boolean a : list) {
                if (a) { count++; }
            }
            /*for (Boolean a : list) {
                System.out.println(a);
            }*/

            if (pw.whitespace()) {
                if(pw.length()){
                    switch (count){
                        case 1:
                            b=ms.invalid();
                            break;
                        case 2:
                        case 3:
                            b=ms.ok();
                            break;
                        case 4:
                            b=ms.strong();
                            break;
                        case 5:
                            b=ms.veryStrong();
                            break;
                    }
                }
                else{
                    b=ms.invalid();
                }

            }
            else{
                System.out.print("No whitespace allowed in the password...");
                b=ms.invalid();}
        }while(b);
    }
}
