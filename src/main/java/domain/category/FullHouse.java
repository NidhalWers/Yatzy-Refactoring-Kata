package domain.category;

import domain.Go;
import service.YatzyGame;

public class FullHouse implements YatzyCategory{

    public static final FullHouse INSTANCE = new FullHouse();

    @Override
    public int getScore(Go go){
        int threeOfaKindResult = new YatzyGame().scoring(ThreeOfaKind.INSTANCE, go);
        int twoOfaKindResult = new YatzyGame().scoring(Pair.INSTANCE, go);

        if(threeOfaKindResult != 0 && twoOfaKindResult != 0){
            return threeOfaKindResult + twoOfaKindResult;
        }
        return 0;
    }
}
