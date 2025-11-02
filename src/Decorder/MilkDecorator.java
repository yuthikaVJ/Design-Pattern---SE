package Decorder;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription()+" milk";
    }

    public double getCost() {
        return decoratedCoffee.getCost()+0.5;
    }

}
