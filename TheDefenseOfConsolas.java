import java.util.Scanner;

public class TheDefenseOfConsolas {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Row:");
        int row = Integer.parseInt(input.nextLine());
        System.out.println("Enter the Column:");
        int column = Integer.parseInt(input.nextLine());

        int upperRow = row + 1;
        int upperColumn = column;
        int leftRow = row ;
        int leftColumn = column - 1;
        int rightRow = row;
        int rightColumn = column + 1;
        int lowerRow = row -1;
        int lowerColumn = column;

        System.out.println("Deploy to:");
        System.out.println(ConsoleColors.RED + "Upper " + upperRow + ", " + upperColumn);
        System.out.println(ConsoleColors.RESET);
        System.out.println(ConsoleColors.YELLOW + "Left " + leftRow + ", " + leftColumn);
        System.out.println(ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "Right " + rightRow + ", " + rightColumn);
        System.out.println(ConsoleColors.RESET);
        System.out.println("Lower " + lowerRow + ", " + lowerColumn);

    }
    public class ConsoleColors    {
        public static final String RESET = "\033[0m";
        public static final String RED = "\033[0;31m";
        public static final String YELLOW = "\033[0;33m";
        public static final String GREEN = "\033[0;32m";
    }
}
