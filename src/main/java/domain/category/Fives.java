package domain.category;

import domain.Go;
import service.DesiredNumberUtils;

public class Fives implements YatzyCategory {

    public static final Fives INSTANCE = new Fives();

    @Override
    public int getScore(Go go) {
        int desiredNumber = 5;
        return DesiredNumberUtils.resultForDesiredNumber(go, desiredNumber);
    }
}
