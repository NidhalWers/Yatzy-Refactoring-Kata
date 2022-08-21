package domain.category;

import domain.Go;
import service.DesiredNumberUtils;

public class Twos implements YatzyCategory {

    public static final Twos INSTANCE = new Twos();

    @Override
    public int getScore(Go go) {
        int desiredNumber = 2;
        return DesiredNumberUtils.resultForDesiredNumber(go, desiredNumber);
    }
}
