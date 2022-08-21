package domain.category;

import domain.Go;
import service.DesiredNumberUtils;

public class Threes implements YatzyCategory {

    public static final Threes INSTANCE = new Threes();

    @Override
    public int getScore(Go go) {
        int desiredNumber = 3;
        return DesiredNumberUtils.resultForDesiredNumber(go, desiredNumber);
    }
}
