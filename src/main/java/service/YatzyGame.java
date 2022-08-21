package service;

import domain.Go;
import domain.category.YatzyCategory;

public class YatzyGame {

    public int scoring(YatzyCategory category, Go go){
        return category.getScore(go);
    }

}
