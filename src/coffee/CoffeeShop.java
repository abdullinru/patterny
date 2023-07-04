package coffee;

public class CoffeeShop {

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch (type) {

            case EXPRESSO:
                coffee = new Expresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            case CAFFE_LATTE:
                coffee = new CaffeLatte();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
        }
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.poutIntoCup();

        return coffee;
    }
}
