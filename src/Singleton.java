import javax.xml.crypto.dsig.SignedInfo;

/*
+ простота и прозрачность кода
+ высокая производительность в многопоточной среде
+ ленивая инициализация
- не Потокобезопасно
 */
public class Singleton {

    private static Singleton INSTANCE;
    private Singleton() {

    }
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
