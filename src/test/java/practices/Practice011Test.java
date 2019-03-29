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
import static org.junit.Assert.assertEquals;

public class Practice011Test {
    //テスト１＿例題の通り
    int[] TestArray1_arg =      new int[] {0,1,2,3,4,5,6,7,8,9};
    int[] TestArray1_exp_Odd =  new int[] {  1,  3,  5,  7,  9};
    int[] TestArray1_exp_Even = new int[] {0,  2,  4,  6,  8  };

    //テスト２＿負の数を入れる
    int[] TestArray2_arg =      new int[] {-3,-2,-1,0, 1,2,3};
    int[] TestArray2_exp_Odd =  new int[] {-3,   -1,       3};
    int[] TestArray2_exp_Even = new int[] {   -2,   0,   2  };

    //テスト３＿重複がある
    int[] TestArray3_arg =      new int[] {2,2,4,4,0,0};
    int[] TestArray3_exp_Odd =  new int[] {    1,1    };
    int[] TestArray3_exp_Even = new int[] {2,2,    0,0};

    //テスト４＿一方が空
    int[] TestArray4_arg =      new int[] {1,3,5,7,9};
    int[] TestArray4_exp_Odd =  new int[] {1,3,5,7,9};
    int[] TestArray4_exp_Even = new int[] {};

    @Test
    public void getOdd() {
        //テスト１
        int[]
        assertEquals(TestArray1_exp_Odd, main.java.practices.Practice011.getOdd(TestArray1_arg));
        //テスト２
        assertEquals(TestArray2_exp_Odd, main.java.practices.Practice011.getOdd(TestArray2_arg));
        //テスト３
        assertEquals(TestArray3_exp_Odd, main.java.practices.Practice011.getOdd(TestArray3_arg));
        //テスト４
        assertEquals(TestArray3_exp_Odd, main.java.practices.Practice011.getOdd(TestArray4_arg));
    }

    @Test
    public void getEven() {
        //テスト１
        assertEquals(TestArray1_exp_Even, main.java.practices.Practice011.getOdd(TestArray1_arg));
        //テスト２
        assertEquals(TestArray2_exp_Even, main.java.practices.Practice011.getOdd(TestArray2_arg));
        //テスト３
        assertEquals(TestArray3_exp_Even, main.java.practices.Practice011.getOdd(TestArray3_arg));
        //テスト４
        assertEquals(TestArray4_exp_Even, main.java.practices.Practice011.getOdd(TestArray4_arg));
    }
}