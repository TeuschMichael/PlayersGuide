import java.util.Scanner;

public class RepairingTheClocktower {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = Integer.parseInt(input.nextLine());

        if (number % 2 != 0) {
            System.out.println("Tock");
        } else {
            System.out.println("Tick");
        }
    }
}
