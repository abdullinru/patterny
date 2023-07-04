import javax.xml.crypto.dsig.SignedInfo;

/*
+ простота и прозрачность кода
- высокая   производительность в многопоточной среде
+ ленивая инициализация
+ Потокобезопасно

- не поддерживается на версиях java ниже 1.5
 */
public class Singleton {

    private static volatile Singleton INSTANCE;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
