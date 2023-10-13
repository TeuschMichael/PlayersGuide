import java.util.Scanner;

public class SimulasTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 1;
        int y = 2;

        enum Chest {
            OPEN,
            CLOSED,
            LOCKED
        }

        Chest open = Chest.OPEN;
        Chest locked = Chest.LOCKED;
        Chest closed = Chest.CLOSED;

        Chest state = Chest.CLOSED;

        while (x != y) {
            System.out.println("The Chest is " + state);
            System.out.println("Do you want to: 1: open 2: close 3: lock 4: unlock");
            int answer = Integer.parseInt(input.nextLine());

            if(answer == 1 && state == Chest.CLOSED) {
                state = Chest.OPEN;
            } else if(answer == 2 && state == Chest.OPEN) {
                state = Chest.CLOSED;
            } else if (answer == 3 && state == Chest.CLOSED) {
                state = Chest.LOCKED;
            } else if (answer == 4 && state == Chest.LOCKED) {
                state = Chest.CLOSED;
            }
        }
    }
}
