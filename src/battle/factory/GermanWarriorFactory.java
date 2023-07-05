package battle.factory;

import battle.german.GermanArcher;
import battle.german.GermanCavalry;
import battle.german.GermanPekchota;
import battle.intefaces.Archer;
import battle.intefaces.Cavalry;
import battle.intefaces.Pekhota;

public class GermanWarriorFactory extends WarriorFactory{
    @Override
    public Archer createArcher() {
        return new GermanArcher();
    }

    @Override
    public Cavalry createCavalry() {
        return new GermanCavalry();
    }

    @Override
    public Pekhota createPekchota() {
        return new GermanPekchota();
    }
}
