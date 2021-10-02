package Decorator;

import Desserts.*;
import Ingredients.*;

public class CoffeeBoom {

    public static void main(String[] args) {

        System.out.println("Welcome to CoffeeBoom! <3" + "\n");

        // Order1 - Classic Waffles
        Dessert dessert = new Waffles();
        System.out.println(dessert.getDescription()
                + " $" + dessert.cost());

        // Order2 - Pancakes with strawberries and chocolate
        Dessert dessert2 = new Pancakes();
        dessert2 = new Strawberry(dessert2);
        dessert2 = new Chocolate(dessert2);
        System.out.println(dessert2.getDescription()
                + " $" + dessert2.cost());

        // Order3 - Brownie with blueberries, caramel, vanilla syrup and almond
        Dessert dessert3 = new Brownie();
        dessert3 = new Blueberry(dessert3);
        dessert3 = new Caramel(dessert3);
        dessert3 = new Vanilla(dessert3);
        dessert3 = new Almond(dessert3);
        System.out.println(dessert3.getDescription()
                + " $" + dessert3.cost());
    }
}
