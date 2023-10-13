public class TheMagicCannon {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println("Normal");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(ConsoleColors.YELLOW + "Combined");
                System.out.print(ConsoleColors.RESET);
            }
            else if (i % 3 == 0) {
                System.out.println(ConsoleColors.RED + "Fire");
                System.out.print(ConsoleColors.RESET);
            } else if (i % 5 == 0) {
                System.out.println(ConsoleColors.BLUE + "Electric");
                System.out.print(ConsoleColors.RESET);
            }
        }
    }
	
    public class ConsoleColors {

        public static final String RESET = "\033[0m";
        public static final String RED = "\033[0;31m";
        public static final String YELLOW = "\033[0;33m";
        public static final String BLUE = "\033[0;34m";
    }
}
