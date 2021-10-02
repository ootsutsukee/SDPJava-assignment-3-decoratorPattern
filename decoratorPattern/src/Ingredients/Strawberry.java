package Ingredients;

import Desserts.Dessert;

public class Strawberry extends Ingredient{
    Dessert dessert;

    public Strawberry(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + " with Strawberry";
    }

    @Override
    public double cost() {
        return .49 + dessert.cost();
    }
}
