import adapter.TotalTime;
import battle.factory.GermanWarriorFactory;
import battle.factory.RussianWarriorFactory;
import battle.factory.WarriorFactory;
import coffee.AmericanCoffeeShop;
import coffee.CoffeeShop;
import coffee.CoffeeType;
import coffee.ItalianCoffeeShop;
import proxy.MyBank;
import proxy.MyBankProxy;

public class Main {
    public static void main(String[] args) {
        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);

        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        americanCoffeeShop.orderCoffee(CoffeeType.AMERICANO);

        WarriorFactory factory;
        factory = new GermanWarriorFactory();
        factory.createArcher();
        factory.createCavalry();
        factory.createPekchota();

        factory = new RussianWarriorFactory();
        factory.createArcher();
        factory.createCavalry();
        factory.createPekchota();

        MyBank myBank = new MyBank();
        MyBankProxy myBankProxy = new MyBankProxy(myBank);
        myBankProxy.getUserMoney();
        myBankProxy.setUserMoney();

    }
}