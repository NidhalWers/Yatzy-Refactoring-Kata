package domain.category;

import domain.Go;

import java.util.Arrays;

public class LargeStraight implements YatzyCategory {

    public static final LargeStraight INSTANCE = new LargeStraight();

    @Override
    public int getScore(Go go) {
        int[] sortedRollsValue = Arrays.stream(go.getRolls())
                .sorted().toArray();
        for(int i = 0; i<sortedRollsValue.length ; i++){
            if(sortedRollsValue[i] != i+2){
                return 0;
            }
        }
        return 20;
    }
}
