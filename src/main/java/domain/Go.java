package domain;

public class Go {

    private int[] rolls;

    private Go(int[] rolls) {
        this.rolls = rolls;
    }

    public static Go factory(int... rolls){
        return new Go(rolls);
    }

    public int[] getRolls() {
        return rolls;
    }
}
