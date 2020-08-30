package Java_Fundamentals_Exercises.String_class_exercise;

public class Message {

    public boolean invalid(){
        System.out.println("Invalid password\n\n"+"Follow the below criteria for  password:\n+" +
                "1. Password contains at least one uppercase character\n" +
                "2. Password contains at least one lowercase character\n" +
                "3. Contains at least one number\n" +
                "4. Contains at least one special character (e.g., !, _ etc)\n" +
                "5. Password length must be at least 8 characters long\n" +
                "6. Cannot contain a sequence of 3 same characters (i.e.\n" +
                "aaa) or a sequence of 3 consecutive characters (i.e abc)\n");

        return true;
    }

    public boolean ok(){
        System.out.println("Password OK\n");
        return false;
    }

    public boolean strong(){
        System.out.println("Strong Password\n");
        return false;
    }

    public boolean veryStrong(){
        System.out.println("Very Strong Password OK\n");
        return false;
    }
}
