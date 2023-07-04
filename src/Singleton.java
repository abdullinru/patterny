import javax.xml.crypto.dsig.SignedInfo;

/*
+ простота и прозрачность кода
- низкая  производительность в многопоточной среде
+ ленивая инициализация
+ Потокобезопасно
 */
public class Singleton {

    private static Singleton INSTANCE;
    private Singleton() {

    }
    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
