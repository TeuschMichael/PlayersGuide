import java.util.Scanner;

public class BuyingInventory {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Item Shop List:");
        System.out.println("1.Rope");
        System.out.println("2.Torches");
        System.out.println("3.Climbing Equipment");
        System.out.println("4.Clean Water");
        System.out.println("5.Machete");
        System.out.println("6.Canoe");
        System.out.println("7.FoodSupplies");

        System.out.println("Enter your name:");
        String name = input.nextLine();
        String discountName = "Michael";

        System.out.println("Enter your number of choice:");
        int choice = Integer.parseInt(input.nextLine());
        String price = "";

        switch (choice) {
            case 1 : price = "10";
            break;
            case 2 : price = "15";
                break;
            case 3 : price = "25";
                break;
            case 4 : price = "1";
                break;
            case 5 : price = "20";
                break;
            case 6 : price = "200";
                break;
            case 7 : price = "1";
                break;
        }

        if (name.equals(discountName)) {
           int discountPrice = (Integer.parseInt(price) / 2);

            System.out.println("The item costs " + discountPrice + " gold coins.");
        } else
        System.out.println("The item costs " + price + " gold coins.");
    }
}
