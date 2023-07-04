import coffee.AmericanCoffeeShop;
import coffee.CoffeeShop;
import coffee.CoffeeType;
import coffee.ItalianCoffeeShop;

public class Main {
    public static void main(String[] args) {
        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);

        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        americanCoffeeShop.orderCoffee(CoffeeType.AMERICANO);
    }
}