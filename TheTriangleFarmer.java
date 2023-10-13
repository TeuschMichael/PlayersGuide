import java.util.Scanner;

public class TheTriangleFarmer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the height.");
        double height = Double.parseDouble(input.nextLine());
        System.out.println("Enter the base");
        double base = Double.parseDouble(input.nextLine());

        double area = (base * height) / 2;

        System.out.println("The area of the triangle is " + area + ".");

    }
}
