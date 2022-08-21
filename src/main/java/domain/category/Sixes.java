package domain.category;

import domain.Go;
import service.DesiredNumberUtils;

public class Sixes implements YatzyCategory{

    public static final Sixes INSTANCE = new Sixes();

    @Override
    public int getScore(Go go) {
        int desiredNumber = 6;
        return DesiredNumberUtils.resultForDesiredNumber(go, desiredNumber);
    }
}
