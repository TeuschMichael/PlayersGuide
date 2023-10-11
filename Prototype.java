import java.util.Scanner;
class Prototype {

  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Encoded one, please enter a number");
    int location = input.nextInt();

    
    while (location > 100 || location < 0) {
      System.out.println("Encoded one, please enter a number");
      location = input.nextInt();
    }

    for (int i = 0; i < 50; i++) {
      System.out.println();
    }

    int answer;

    do {
      System.out.println("Player, please enter a number between 0 and 100");
      answer = input.nextInt();
      if (answer < location) {
        System.out.println("The number is too low");
      } else if (answer > location) {
        System.out.println("The number is too high");
      }
    }
    while (answer != location);
    System.out.println("You guessed the number!");
  }
}