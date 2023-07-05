package coffee;

public class AmericanCoffeeShop extends CoffeeShop{
    @Override
    protected Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case EXPRESSO:
                coffee = new AmericanStyleExpresso();
                break;
            case AMERICANO:
                coffee = new AmericanStyleAmericano();
                break;
            case CAFFE_LATTE:
                coffee = new AmericanStyleCaffeLatte();
                break;
            case CAPPUCCINO:
                coffee = new AmericanStyleCappuccino();
                break;
        }
        return coffee;
    }
}
