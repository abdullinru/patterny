package coffee;

public abstract class CoffeeShop {

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.poutIntoCup();

        return coffee;
    }

    protected abstract Coffee createCoffee(CoffeeType type);
}
