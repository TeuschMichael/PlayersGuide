import java.util.Scanner;

public class FourSistersAndADuckbear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of eggs:");
        int eggNumber = Integer.parseInt(input.nextLine());
        int eggsToShare = eggNumber / 4;
        int duckEggs = eggNumber % 4;

        System.out.println("The sisters get " + eggsToShare + " eggs, " + "and the bear gets " + duckEggs + " eggs.");
    }
}
