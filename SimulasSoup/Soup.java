public class Soup {

    public enum Recipe {
        SOUP,
        STEW,
        GUMBO
    }

    Recipe soup = Recipe.SOUP;
    Recipe stew = Recipe.STEW;
    Recipe gumbo = Recipe.GUMBO;


    enum Seasoning {
        SWEET,
        SALTY,
        HOT
    }

    Seasoning sweet = Seasoning.SWEET;
    Seasoning salty = Seasoning.SALTY;
    Seasoning hot = Seasoning.HOT;


    enum Ingredient {
        MUSHROOM,
        CHICKEN,
        CARROT,
        POTATO
    }

    Ingredient mushroom = Ingredient.MUSHROOM;
    Ingredient chicken = Ingredient.CHICKEN;
    Ingredient carrot = Ingredient.CARROT;
    Ingredient potato = Ingredient.POTATO;

    public Recipe getSoup() {
        return soup;
    }

    public Recipe getStew() {
        return stew;
    }

    public Recipe getGumbo() {
        return gumbo;
    }

    public Seasoning getSweet() {
        return sweet;
    }

    public Seasoning getSalty() {
        return salty;
    }

    public Seasoning getHot() {
        return hot;
    }

    public Ingredient getMushroom() {
        return mushroom;
    }

    public Ingredient getChicken() {
        return chicken;
    }

    public Ingredient getCarrot() {
        return carrot;
    }

    public Ingredient getPotato() {
        return potato;
    }
}
