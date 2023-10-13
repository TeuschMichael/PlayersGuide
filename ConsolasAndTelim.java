import java.util.Scanner;

public class ConsolasAndTelim {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bread is ready");
        System.out.println("Who is the bread for?");
        String owner = scanner.nextLine();
        System.out.println(owner + " got bread.");

    }
}
