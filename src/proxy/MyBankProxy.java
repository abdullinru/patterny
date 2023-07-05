package proxy;

public class MyBankProxy implements Bank{

    private MyBank myBank;

    public MyBankProxy(MyBank myBank) {
        this.myBank = myBank;
    }
    @Override
    public void setUserMoney() {
        System.out.println("Chech user");
        myBank.setUserMoney();
        System.out.println("close session");
    }

    @Override
    public int getUserMoney() {
        System.out.println("Chech user");
        return myBank.getUserMoney();
    }
}
