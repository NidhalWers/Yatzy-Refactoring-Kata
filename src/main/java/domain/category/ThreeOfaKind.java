package domain.category;

import domain.Go;
import service.OccurrenceUtils;

public class ThreeOfaKind implements YatzyCategory{

    public static final ThreeOfaKind INSTANCE = new ThreeOfaKind();

    @Override
    public int getScore(Go go) {
        int[] numberOfOccurrenceByValue = OccurrenceUtils.createOccurrencesTab(go);

        return OccurrenceUtils.resultForaNumberOfOccurrence(numberOfOccurrenceByValue, 3);
    }
}
