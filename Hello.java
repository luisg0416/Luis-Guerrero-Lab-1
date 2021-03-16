import java.util.Scanner;

public class Hello {
    public static void main (String[] args) {
        Scanner scnr = new Scanner (System.in);
        String name;
        String location;
        String age;

        System.out.print("Hello. What is your name? ");
        name = scnr.next(); // User inputs their name.

        System.out.print("It's nice to meet you, " + name + "." + " How old are you? " );
        age = scnr.next(); //User inputs their age.

        System.out.println("I see that you are still quite young at only " + age + ".");
        System.out.print("Where do you live? ");
        location = scnr.next(); //User inputs where he or she lives.

        System.out.print("Wow! I've always wanted to go to " + location + "." + " Thanks for chatting with me. Bye!");
    }
}
