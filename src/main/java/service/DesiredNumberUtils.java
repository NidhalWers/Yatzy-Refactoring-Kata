package service;

import domain.Go;

public class DesiredNumberUtils {

    public static int resultForDesiredNumber(Go go, int desiredNumber) {
        int result = 0;
        for(int i = 0; i< go.getRolls().length; i++){
            if (go.getRolls()[i] == desiredNumber){
                result += desiredNumber;
            }
        }
        return result;
    }

}
