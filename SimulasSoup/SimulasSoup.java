import Soup;
import java.util.Scanner;

public class SimulasSoup {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Soup menu = new Soup();

        System.out.println("Please choose your meal, the first choice is seasoning:");
        System.out.println("1:Sweet 2:Salty 3:Hot");
        int season = Integer.parseInt(input.nextLine());
        System.out.println("Please choose your dish:");
        System.out.println("1:Soup 2:Stew 3:Gumbo");
        int dish = Integer.parseInt(input.nextLine());
        System.out.println("Please choose your main filling:");
        System.out.println("1:Mushroom 2:Chicken 3:Carrot 4:Potato");
        int filling = Integer.parseInt(input.nextLine());

        Soup.Recipe soup = Soup.Recipe.SOUP;
        Soup.Recipe stew = Soup.Recipe.STEW;
        Soup.Recipe gumbo = Soup.Recipe.GUMBO;
        Soup.Recipe currentRecipe = Soup.Recipe.SOUP;

        Soup.Seasoning sweet = Soup.Seasoning.SWEET;
        Soup.Seasoning salty = Soup.Seasoning.SALTY;
        Soup.Seasoning hot = Soup.Seasoning.HOT;
        Soup.Seasoning currentSeasoning = Soup.Seasoning.SWEET;

        Soup.Ingredient chicken = Soup.Ingredient.CHICKEN;
        Soup.Ingredient carrot = Soup.Ingredient.CARROT;
        Soup.Ingredient mushroom = Soup.Ingredient.MUSHROOM;
        Soup.Ingredient potato = Soup.Ingredient.POTATO;
        Soup.Ingredient currentIngredient = Soup.Ingredient.POTATO;

        switch (season) {
            case 1: currentSeasoning = sweet; break;
            case 2: currentSeasoning = salty; break;
            case 3: currentSeasoning = hot; break;
        }

        switch (dish) {
            case 1: currentRecipe = soup; break;
            case 2: currentRecipe = stew;  break;
            case 3: currentRecipe = gumbo; break;
        }

        switch (filling) {
            case 1: currentIngredient = mushroom; break;
            case 2: currentIngredient = chicken; break;
            case 3: currentIngredient = carrot; break;
            case 4: currentIngredient = potato; break;
        }

        System.out.println("You have chosen:" + currentSeasoning + " " + currentIngredient + " " + currentRecipe + "!");
    }
}
