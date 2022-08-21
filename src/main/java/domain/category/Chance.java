package domain.category;

import domain.Go;

public class Chance implements YatzyCategory {

    public static final Chance INSTANCE = new Chance();

    @Override
    public int getScore(Go go) {
        return go.getRolls()[0] +
        go.getRolls()[1] +
        go.getRolls()[2] +
        go.getRolls()[3] +
        go.getRolls()[4];
    }
}
