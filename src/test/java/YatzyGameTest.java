import domain.Go;
import domain.category.*;
import org.junit.*;
import service.YatzyGame;

import static org.junit.Assert.*;

public class YatzyGameTest {

    @Test
    public void chance_scores_sum_of_all_dice() {
        assertEquals(15, new YatzyGame().scoring(Chance.INSTANCE, Go.factory(2,3,4,5,1)));
        assertEquals(16, new YatzyGame().scoring(Chance.INSTANCE, Go.factory(3,3,4,5,1)));
    }

    @Test public void yatzy_scores_50() {
        assertEquals(50, new YatzyGame().scoring(Yatzy.INSTANCE, Go.factory(4,4,4,4,4)));
        assertEquals(50, new YatzyGame().scoring(Yatzy.INSTANCE, Go.factory(6,6,6,6,6)));
        assertEquals(0, new YatzyGame().scoring(Yatzy.INSTANCE, Go.factory(6,6,6,6,3)));
    }

    @Test public void test_1s() {
        assertEquals(1, new YatzyGame().scoring(Ones.INSTANCE, Go.factory(1, 2, 3, 4, 5)));
        assertEquals(2, new YatzyGame().scoring(Ones.INSTANCE, Go.factory(1, 2, 1, 4, 5)));
        assertEquals(0, new YatzyGame().scoring(Ones.INSTANCE, Go.factory(6, 2, 2, 4, 5)));
        assertEquals(4, new YatzyGame().scoring(Ones.INSTANCE, Go.factory(1, 2, 1, 1, 1)));
        assertEquals(4, new YatzyGame().scoring(Ones.INSTANCE, Go.factory(1, 2, 1, 1, 1)));
    }

    @Test
    public void test_2s() {
        assertEquals(4, new YatzyGame().scoring(Twos.INSTANCE, Go.factory(1,2,3,2,6)));
        assertEquals(10, new YatzyGame().scoring(Twos.INSTANCE, Go.factory(2,2,2,2,2)));
    }

    @Test
    public void test_threes() {
        assertEquals(6, new YatzyGame().scoring(Threes.INSTANCE, Go.factory(1,2,3,2,3)));
        assertEquals(12, new YatzyGame().scoring(Threes.INSTANCE, Go.factory(2,3,3,3,3)));
    }

    @Test
    public void fours_test() {
        assertEquals(12, new YatzyGame().scoring(Fours.INSTANCE, Go.factory(4,4,4,5,5)));
        assertEquals(8, new YatzyGame().scoring(Fours.INSTANCE, Go.factory(4,4,5,5,5)));
        assertEquals(4, new YatzyGame().scoring(Fours.INSTANCE, Go.factory(4,5,5,5,5)));
    }

    @Test
    public void fives() {
        assertEquals(10, new YatzyGame().scoring(Fives.INSTANCE, Go.factory(4,4,4,5,5)));
        assertEquals(15, new YatzyGame().scoring(Fives.INSTANCE, Go.factory(4,4,5,5,5)));
        assertEquals(20, new YatzyGame().scoring(Fives.INSTANCE, Go.factory(4,5,5,5,5)));
    }

    @Test
    public void sixes_test() {
        assertEquals(0, new YatzyGame().scoring(Sixes.INSTANCE, Go.factory(4,4,4,5,5)));
        assertEquals(6, new YatzyGame().scoring(Sixes.INSTANCE, Go.factory(4,4,6,5,5)));
        assertEquals(18, new YatzyGame().scoring(Sixes.INSTANCE, Go.factory(6,5,6,6,5)));
    }

    @Test
    public void one_pair() {
        assertEquals(6, new YatzyGame().scoring(Pair.INSTANCE, Go.factory(3,4,3,5,6)));
        assertEquals(10, new YatzyGame().scoring(Pair.INSTANCE, Go.factory(5,3,3,3,5)));
        assertEquals(12, new YatzyGame().scoring(Pair.INSTANCE, Go.factory(5,3,6,6,5)));
    }

    @Test
    public void two_Pair() {
        assertEquals(16, new YatzyGame().scoring(TwoPairs.INSTANCE, Go.factory(3,3,5,4,5)));
        assertEquals(16, new YatzyGame().scoring(TwoPairs.INSTANCE, Go.factory(3,3,5,5,5)));
    }

    @Test
    public void three_of_a_kind() {
        assertEquals(9, new YatzyGame().scoring(ThreeOfaKind.INSTANCE, Go.factory(3,3,3,4,5)));
        assertEquals(15, new YatzyGame().scoring(ThreeOfaKind.INSTANCE, Go.factory(5,3,5,4,5)));
        assertEquals(9, new YatzyGame().scoring(ThreeOfaKind.INSTANCE, Go.factory(3,3,3,3,5)));
        assertEquals(9, new YatzyGame().scoring(ThreeOfaKind.INSTANCE, Go.factory(3,3,3,3,3)));
    }

    @Test
    public void four_of_a_knd() {
        assertEquals(12, new YatzyGame().scoring(FourOfaKind.INSTANCE, Go.factory(3,3,3,3,5)));
        assertEquals(20, new YatzyGame().scoring(FourOfaKind.INSTANCE, Go.factory(5,5,5,4,5)));
        assertEquals(12, new YatzyGame().scoring(FourOfaKind.INSTANCE, Go.factory(3,3,3,3,3)));
    }

    @Test
    public void smallStraight() {
        assertEquals(15, new YatzyGame().scoring(SmallStraight.INSTANCE, Go.factory(1,2,3,4,5)));
        assertEquals(15, new YatzyGame().scoring(SmallStraight.INSTANCE, Go.factory(2,3,4,5,1)));
        assertEquals(0, new YatzyGame().scoring(SmallStraight.INSTANCE, Go.factory(1,2,2,4,5)));
    }

    @Test
    public void largeStraight() {
        assertEquals(20, new YatzyGame().scoring(LargeStraight.INSTANCE, Go.factory(6,2,3,4,5)));
        assertEquals(20, new YatzyGame().scoring(LargeStraight.INSTANCE, Go.factory(2,3,4,5,6)));
        assertEquals(0, new YatzyGame().scoring(LargeStraight.INSTANCE, Go.factory(1,2,2,4,5)));
    }

    @Test
    public void fullHouse() {
        assertEquals(18, new YatzyGame().scoring(FullHouse.INSTANCE, Go.factory(6,2,2,2,6)));
        assertEquals(0, new YatzyGame().scoring(FullHouse.INSTANCE, Go.factory(2,3,4,5,6)));
    }
}
