import java.util.Scanner;

public class ReplicatorOfDto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] first = new int[5];
        int[] second = new int[5];

        System.out.println("Enter 5 numbers one for one:");
        for (int i = 0; i < 5; i++){
            first[i] = input.nextInt();
        }

        for (int i = 0; i < first.length; i++)
            System.out.print(first[i] + " ");

        for (int i = 0; i < first.length; i++) {
            second[i] = first[i];
           }

        for (int i = 0; i < first.length; i++) {
            System.out.print(second[i] + " ");
        }
    }
}
