package battle.factory;

import battle.intefaces.Archer;
import battle.intefaces.Cavalry;
import battle.intefaces.Pekhota;

public abstract class WarriorFactory {

    public abstract Archer createArcher();

    public abstract Cavalry createCavalry();

    public abstract Pekhota createPekchota();

}
