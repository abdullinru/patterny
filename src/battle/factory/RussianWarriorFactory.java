package battle.factory;

import battle.intefaces.Archer;
import battle.intefaces.Cavalry;
import battle.intefaces.Pekhota;
import battle.russian.RussianArcher;
import battle.russian.RussianCavalry;
import battle.russian.RussianPekchota;

public class RussianWarriorFactory extends WarriorFactory{
    @Override
    public Archer createArcher() {
        return new RussianArcher();
    }

    @Override
    public Cavalry createCavalry() {
        return new RussianCavalry();
    }

    @Override
    public Pekhota createPekchota() {
        return new RussianPekchota();
    }
}
