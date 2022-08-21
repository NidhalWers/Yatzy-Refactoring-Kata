package domain.category;

import domain.Go;

import java.util.Arrays;

public class SmallStraight implements YatzyCategory{

    public static final SmallStraight INSTANCE = new SmallStraight();

    @Override
    public int getScore(Go go) {
        int[] sortedRollsValue = Arrays.stream(go.getRolls())
                .sorted().toArray();
        for(int i = 0; i<sortedRollsValue.length ; i++){
            if(sortedRollsValue[i] != i+1){
                return 0;
            }
        }
        return 15;
    }
}
