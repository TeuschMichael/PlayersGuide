import java.util.Scanner;

public class Watchtower {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter x:");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Enter y:");
        int y = Integer.parseInt(input.nextLine());

        String a = "north";
        String b = "south";
        String c = "east";
        String d = "west";
        String directionOne = "";
        String directionTwo = "";

        if (x == 0 && y == 0){
            System.out.println("The enemy is here!");

            }
        else if ( x > 0) {
            directionOne = c;
        } else if ( x < 0) {
            directionOne = d;
        } else if (y > 0) {
            directionTwo = a;
        } else {
            directionTwo = b;
        }
        System.out.println("the enemy is to the "  + directionTwo + directionOne);
    }
}
