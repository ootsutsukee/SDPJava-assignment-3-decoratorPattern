package Ingredients;

import Desserts.Dessert;

public class Marshmallow extends Ingredient{
    Dessert dessert;

    public Marshmallow(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Marshmallow";
    }

    @Override
    public double cost() {
        return .99 + dessert.cost();
    }
}
