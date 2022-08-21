package domain.category;

import domain.Go;
import service.DesiredNumberUtils;

public class Ones implements YatzyCategory {

    public static final Ones INSTANCE = new Ones();

    @Override
    public int getScore(Go go) {
        int desiredNumber = 1;
        return DesiredNumberUtils.resultForDesiredNumber(go, desiredNumber);
    }



}
