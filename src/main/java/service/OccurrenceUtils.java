package service;

import domain.Go;

public class OccurrenceUtils {

    public static int[] createOccurrencesTab(Go go) {
        int[] numberOfOccurrenceByValue = new int[6];
        numberOfOccurrenceByValue[go.getRolls()[0]-1]++;
        numberOfOccurrenceByValue[go.getRolls()[1]-1]++;
        numberOfOccurrenceByValue[go.getRolls()[2]-1]++;
        numberOfOccurrenceByValue[go.getRolls()[3]-1]++;
        numberOfOccurrenceByValue[go.getRolls()[4]-1]++;
        return numberOfOccurrenceByValue;
    }

    public static int resultForaNumberOfOccurrence(int[] numberOfOccurrenceByValue, int nbOfOccurrence) {
        for (int i = 0; i < numberOfOccurrenceByValue.length; i++) {
            if (numberOfOccurrenceByValue[numberOfOccurrenceByValue.length-i-1] >= nbOfOccurrence) {
                return (numberOfOccurrenceByValue.length-i) * nbOfOccurrence;
            }
        }
        return 0;
    }
}
