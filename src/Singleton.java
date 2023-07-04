/*
+ простота и прозрачность кода
+ Потокобезопасность
+ высокая производительность в многопоточной среде

- Не ленивая инициализация
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();
    private Singleton() {

    }
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
