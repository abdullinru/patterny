import javax.xml.crypto.dsig.SignedInfo;

/*
+ простота и прозрачность кода
+ высокая   производительность в многопоточной среде
+ ленивая инициализация
+ Потокобезопасно

- для корректной работы необходима гарантия, что объект класса Singleton
инициализируется без ошибок
 */
public class Singleton {


    private Singleton() {

    }

    private static class SingletonHolder {
        public static final Singleton INSTANCE = new Singleton();

    }

    public static Singleton getInstance() {

        return SingletonHolder.INSTANCE;
    }
}
