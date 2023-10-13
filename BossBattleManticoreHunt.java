import java.util.Scanner;

public class BossBattleManticoreHunt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mantiHP = 10;
        int cityHP = 15;
        int damage = 1;
        int rounds = 1;

        System.out.println("Player 1, " +
                "How far away from the city do you want to station the Manticore?");

        int mantiDistance = Integer.parseInt(input.nextLine());

        while(mantiDistance < 0 || mantiDistance >100) {
            System.out.println("Please try again");
            mantiDistance = Integer.parseInt(input.nextLine());
        }

            while(mantiHP > 0) {
                System.out.println("Status: Round:" + rounds + " City HP: " + cityHP + " Manticore HP: " +
                        mantiHP + " Expected Damage: " + damage);
                System.out.println("Player 2, enter the range of the guns");
                int gunRange = Integer.parseInt(input.nextLine());


                if (rounds % 3 == 0 || rounds % 5 == 0) {
                    damage = 3;
                } else if (rounds % 3 == 0 && rounds % 5 == 0) {
                    damage = 10;
                } else  {
                    damage = 1;
                }

                if (mantiDistance == gunRange) {
                    mantiHP -= damage;
                } else if (mantiDistance > gunRange) {
                    System.out.println("The round fell short");
                } else if (mantiDistance < gunRange) {
                    System.out.println("The round overshot");
                }
                rounds++;
                cityHP--;

                if(cityHP <= 0) {
                    System.out.println("Defeat!! The city is burning");
                    break;
                }
            }
            if(mantiHP <= 0) {
                System.out.println("The Manticore is defeated!!");
            }
    }
}
