package domain.category;

import domain.Go;
import service.OccurrenceUtils;

public class FourOfaKind implements YatzyCategory{

    public static final FourOfaKind INSTANCE = new FourOfaKind();

    @Override
    public int getScore(Go go) {
        int[] numberOfOccurrenceByValue = OccurrenceUtils.createOccurrencesTab(go);

        return OccurrenceUtils.resultForaNumberOfOccurrence(numberOfOccurrenceByValue, 4);
    }
}
