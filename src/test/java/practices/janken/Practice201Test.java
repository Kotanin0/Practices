package practices.janken;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Practice201Test {
    
    @Test
    public void liar() {
    }

    @Test
    public void declare() {
    }

    @Test
    public void fight() {
    }

    @Test
    public void judgeは要素数２以外の配列を渡すと要素数２で値が０の配列をかえす() {
        int[] actual1 = {0};
        int[] expected = new int[2];
        assertThat(Practice201.judge(actual1, actual1), is(expected));

        int[] actual2 = {0, 0, 0};
        assertThat(Practice201.judge(actual2, actual2), is(expected));
    }

    @Test
    public void judgeは指定の値以外の値を渡すと要素数２で値が０の配列をかえす() {
        int[] actual1 = {-1, 2};
        int[] expected = new int[2];
        assertThat(Practice201.judge(actual1, actual1), is(expected));

        int[] actual2 = {1, 3};
        assertThat(Practice201.judge(actual2, actual2), is(expected));
    }

    @Test
    public void judgeは指定した得点のとおりの配列をかえす() {
        //・宣言通りの手で勝った -> 5点
        int[] actual1DeclareHands = {0, 0};
        int[] actual1PlayHands = {0, 1};
        int[] expected1 = {5, -5};
        assertThat(Practice201.judge(actual1DeclareHands, actual1PlayHands), is(expected1));
        //・宣言通りの手で負けた -> -3点
        int[] actual2DeclareHands = {0, 1};
        int[] actual2PlayHands = {0, 2};
        int[] expected2 = {-3, 3};
        assertThat(Practice201.judge(actual2DeclareHands, actual2PlayHands), is(expected2));
        //・宣言通りの手であいこ -> 1点
        int[] actual3DeclareHands = {0, 0};
        int[] actual3PlayHands = {0, 0};
        int[] expected3 = {1, 1};
        assertThat(Practice201.judge(actual3DeclareHands, actual3PlayHands), is(expected3));
        //・宣言しなかった手で勝った -> 3点
        int[] actual4DeclareHands = {2, 1};
        int[] actual4PlayHands = {0, 1};
        int[] expected4 = {3, -3};
        assertThat(Practice201.judge(actual4DeclareHands, actual4PlayHands), is(expected4));
        //・宣言しなかった手で負けた -> -5点
        int[] actual5DeclareHands = {1, 1};
        int[] actual5PlayHands = {2, 1};
        int[] expected5 = {-5, 5};
        assertThat(Practice201.judge(actual5DeclareHands, actual5PlayHands), is(expected5));
        //・宣言しなかった手であいこ -> -1点
        int[] actual6DeclareHands = {1, 1};
        int[] actual6PlayHands = {0, 0};
        int[] expected6 = {-1, -1};
        assertThat(Practice201.judge(actual6DeclareHands, actual6PlayHands), is(expected6));
    }

    @Test
    public void isHandBetweenZeroToToo() {
    }

    @Test
    public void judgeWinner() {
    }
}