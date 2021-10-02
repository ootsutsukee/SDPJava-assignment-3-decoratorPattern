package Ingredients;

import Desserts.Dessert;

public class Caramel extends Ingredient{
    Dessert dessert;

    public Caramel(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Caramel";
    }

    @Override
    public double cost() {
        return .69 + dessert.cost();
    }
}
