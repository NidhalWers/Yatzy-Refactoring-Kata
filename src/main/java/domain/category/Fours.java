package domain.category;

import domain.Go;
import service.DesiredNumberUtils;

public class Fours implements YatzyCategory{

    public static final Fours INSTANCE = new Fours();

    @Override
    public int getScore(Go go) {
        int desiredNumber = 4;
        return DesiredNumberUtils.resultForDesiredNumber(go, desiredNumber);
    }
}
