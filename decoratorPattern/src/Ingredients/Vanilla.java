package Ingredients;

import Desserts.Dessert;

public class Vanilla extends Ingredient{
    Dessert dessert;

    public Vanilla(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Vanilla syrup";
    }

    @Override
    public double cost() {
        return .69 + dessert.cost();
    }
}
