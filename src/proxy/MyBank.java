package proxy;

public class MyBank implements Bank{
    @Override
    public void setUserMoney() {
        System.out.println("set money for user");
    }

    @Override
    public int getUserMoney() {
        System.out.println("get money");
        return 100;
    }
}
