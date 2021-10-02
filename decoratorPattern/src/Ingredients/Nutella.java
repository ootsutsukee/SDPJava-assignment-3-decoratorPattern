package Ingredients;

import Desserts.Dessert;

public class Nutella extends Ingredient{
    Dessert dessert;

    public Nutella(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", nutella";
    }

    @Override
    public double cost() {
        return 1.49 + dessert.cost();
    }
}
