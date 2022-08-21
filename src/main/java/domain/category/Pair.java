package domain.category;

import domain.Go;
import service.OccurrenceUtils;

public class Pair implements YatzyCategory{

    public static final Pair INSTANCE = new Pair();

    @Override
    public int getScore(Go go) {
        int[] numberOfOccurrenceByValue = new OccurrenceUtils().createOccurrencesTab(go);

        return OccurrenceUtils.resultForaNumberOfOccurrence(numberOfOccurrenceByValue, 2);
    }
}
