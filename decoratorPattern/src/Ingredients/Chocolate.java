package Ingredients;

import Desserts.Dessert;

public class Chocolate extends Ingredient{
    Dessert dessert;

    public Chocolate(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return .69 + dessert.cost();
    }
}
