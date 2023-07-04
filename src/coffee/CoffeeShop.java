package coffee;

public class CoffeeShop {

    private final SimpleCoffeeFactory coffeeFactory;

    public CoffeeShop(SimpleCoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);

        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.poutIntoCup();

        return coffee;
    }
}
