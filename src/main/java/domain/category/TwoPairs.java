package domain.category;

import domain.Go;
import service.OccurrenceUtils;

public class TwoPairs implements YatzyCategory{

    public static final TwoPairs INSTANCE = new TwoPairs();

    @Override
    public int getScore(Go go) {
        int[] numberOfOccurrenceByValue = OccurrenceUtils.createOccurrencesTab(go);

        int nbOfOccurrence = 2;
        int numberOfPairs = 0;
        int result = 0;
        for (int i = 0; i < numberOfOccurrenceByValue.length; i++) {
            if (numberOfOccurrenceByValue[numberOfOccurrenceByValue.length-i-1] >= nbOfOccurrence) {
                numberOfPairs++;
                result += (numberOfOccurrenceByValue.length-i);
            }
        }
        if (numberOfPairs == 2) {
            return result * nbOfOccurrence;
        }
        return 0;
    }


}
