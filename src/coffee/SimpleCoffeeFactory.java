package coffee;

import static coffee.CoffeeType.*;

public class SimpleCoffeeFactory {

    public Coffee createCoffee(CoffeeType type) {
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
        return coffee;
    }


}
