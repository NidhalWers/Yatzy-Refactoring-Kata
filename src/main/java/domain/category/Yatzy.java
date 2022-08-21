package domain.category;

import domain.Go;

import java.util.Arrays;

public class Yatzy implements YatzyCategory{

    public static final Yatzy INSTANCE = new Yatzy();

    @Override
    public int getScore(Go go) {
        int[] sameNumbers = Arrays.stream(go.getRolls())
                .filter(value -> isDiceValueEqualsToFirstDiceValue(go, value))
                .toArray();
        if(sameNumbers.length == 5){
            return 50;
        }else{
            return 0;
        }
    }

    private boolean isDiceValueEqualsToFirstDiceValue(Go go, int value) {
        return value == go.getRolls()[0];
    }
}
