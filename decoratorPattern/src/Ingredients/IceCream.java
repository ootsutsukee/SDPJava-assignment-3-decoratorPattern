package Ingredients;

import Desserts.Dessert;

public class IceCream extends Ingredient{
    Dessert dessert;

    public IceCream(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Ice-Cream";
    }

    @Override
    public double cost() {
        return 1.29 + dessert.cost();
    }
}
