package Ingredients;

import Desserts.Dessert;

public class Almond extends Ingredient{
    Dessert dessert;

    public Almond(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Almond";
    }

    @Override
    public double cost() { return .7 + dessert.cost();
    }
}
