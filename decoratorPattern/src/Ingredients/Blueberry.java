package Ingredients;

import Desserts.Dessert;

public class Blueberry extends Ingredient {
    Dessert dessert;

    public Blueberry(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + " with Blueberry";
    }

    @Override
    public double cost() {
        return .49 + dessert.cost();
    }
}
