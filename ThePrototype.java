import java.util.Scanner;

public class ThePrototype {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Pilot, enter a number between 0 and 100:");
        int pilot = Integer.parseInt(input.nextLine());

        for (int i = 1; i < 50; i++) {
            System.out.println("");
        }

        System.out.println("Hunter, enter your number:");
        int hunter = Integer.parseInt(input.nextLine());

        do {
            if(pilot > hunter) {
                System.out.println("The number is too low, try again");
                hunter = Integer.parseInt(input.nextLine());
            } else if (pilot < hunter) {
                System.out.println("The number is too high, try again");
                hunter = Integer.parseInt(input.nextLine());
            }
        } while (pilot != hunter);

        System.out.println("Correct!");
    }
}
