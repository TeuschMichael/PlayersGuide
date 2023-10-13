import java.util.Scanner;

public class ThingNamer3000 {

    public static void main(String[] args) {

        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);
        String a = input.next();
        // The kind of thing used
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String b = input.next();
        /* the attributes of the object */
        String c = "of Doom";
        // that it's an object of Doom
        String d = "3000";
        // the string that denotes it's the 3000 implementation
        System.out.println("The " + b + " " + a + " " + c + " " + d + "!");
        // I would combine string c and string d into one variable
    }
}
