package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint = 100;

    private Random random ;

    public boolean isAlive() {
        return ( hitPoint > 0 );
    }
}
