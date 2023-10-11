import java.util.Scanner;
public class Consolas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bread is ready.");
        System.out.println("Who is the bread for");
        String answer = input.nextLine();
        System.out.println(answer + " got bread.");
    }
}