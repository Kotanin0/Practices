package practices;
/**
 * 配列の中身を奇数と偶数に分類する関数 getOdd, getEven を作成しなさい
 *
 * getOdd
 * 引数：整数の配列
 * 返却：奇数のみの配列
 *
 * 　例）引数：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 　　　返却：[1, 3, 5, 7, 9]
 *
 * getEven
 * 引数：整数の配列
 * 返却：偶数のみの配列
 *
 * 　例）引数：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 　　　返却：[0, 2, 4, 6, 8]
 *
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import main.java.practices.Practice011;

public class Practice011Test {
    //テスト１＿例題の通り
    int[] TestArray1_arg =      new int[] {0,1,2,3,4,5,6,7,8,9};
    int[] TestArray1_exp_Odd =  new int[] {  1,  3,  5,  7,  9};
    int[] TestArray1_exp_Even = new int[] {0,  2,  4,  6,  8  };

    //テスト２＿負の数を入れる
    int[] TestArray2_arg =      new int[] {-3,-2,-1,0, 1,2,3};
    int[] TestArray2_exp_Odd =  new int[] {-3,   -1,   1,  3};
    int[] TestArray2_exp_Even = new int[] {   -2,   0,   2  };

    //テスト３＿偶数の返り値が空
    int[] TestArray3_arg =      new int[] {1,3,5,7,9};
    int[] TestArray3_exp_Even = new int[] {};

    //テスト３＿奇数の返り値が空
    int[] TestArray4_arg =      new int[] {2,4,6,8,10};
    int[] TestArray4_exp_Odd =  new int[] {};

    @Test
    public void getOddは例題通りの返り値をくれる_TestArray1() {
        assertThat(Practice011.getOdd(TestArray1_arg),is(TestArray1_exp_Odd));
    }

    @Test
    public void getEvenは例題通りの返り値をくれえる_TestArray1(){
        assertThat(Practice011.getEven(TestArray1_arg),is(TestArray1_exp_Even));
    }

    @Test
    public void getOddに負の数が含まれる配列を渡しても奇数がかえってくる_TestArray2(){
        assertThat(Practice011.getOdd(TestArray2_arg),is(TestArray2_exp_Odd));
    }

    @Test
    public void getEvenに負の数が含まれる配列を渡しても奇数がかえってくる_TestArray2(){
        assertThat(Practice011.getEven(TestArray2_arg),is(TestArray2_exp_Even));
    }

    @Test
    public void getOddに偶数がふくまれない配列を渡すと空の配列がかえってくる_TestArray3(){
        assertThat(Practice011.getEven(TestArray3_arg),is(TestArray3_exp_Even));
    }
    @Test
    public void getOddに奇数がふくまれない配列を渡すと空の配列がかえってくる_TestArray3(){
        assertThat(Practice011.getOdd(TestArray4_arg),is(TestArray4_exp_Odd));
    }

}