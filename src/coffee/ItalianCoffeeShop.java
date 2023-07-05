package coffee;

public class ItalianCoffeeShop extends CoffeeShop{
    @Override
    protected Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case EXPRESSO:
                coffee = new ItalianStyleExpresso();
                break;
            case AMERICANO:
                coffee = new ItalianStyleAmericano();
                break;
            case CAFFE_LATTE:
                coffee = new ItalianStyleCaffeLatte();
                break;
            case CAPPUCCINO:
                coffee = new ItalianStyleCappuccino();
                break;
        }
        return coffee;
    }
}
