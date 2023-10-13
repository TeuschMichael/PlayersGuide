import java.util.Scanner;

public class TheDominionOfKings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of provinces:");
        int provinces = Integer.parseInt(input.nextLine());
        System.out.println("Enter the number of duchies:");
        int duchies = Integer.parseInt(input.nextLine());
        System.out.println("Enter the number of estates:");
        int estates = Integer.parseInt(input.nextLine());

        int provinceScore = provinces * 6;
        int duchieScore = duchies * 3;

        int total = provinceScore + duchieScore + estates;

        System.out.println("The total score is " + total + " points!");
    }
}
