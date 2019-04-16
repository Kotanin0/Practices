package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 配列の中身を奇数と偶数に分類する関数 getOdd, getEven を作成しなさい
 * <p>
 * getOdd
 * 引数：整数の配列
 * 返却：奇数のみの配列
 * <p>
 * 　例）引数：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 　　　返却：[1, 3, 5, 7, 9]
 * <p>
 * getEven
 * 引数：整数の配列
 * 返却：偶数のみの配列
 * <p>
 * 　例）引数：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 　　　返却：[0, 2, 4, 6, 8]
 */


public class Practice011 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int[] n = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        getOdd(n);
    }


    // 奇数のみを返す
    public static int[] getOdd(int[] n) {

        List<Integer> oddList = new ArrayList<Integer>();

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                oddList.add(n[i]);
            }
        }
        int[] arrayO = new int[oddList.size()];
        for (int i = 0; i < arrayO.length; i++) {
            arrayO[i] = oddList.get(i);
        }

        return arrayO;
    }

    // 偶数のみを返す
    public static int[] getEven(int[] n) {

        List<Integer> evenList = new ArrayList<Integer>();

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                evenList.add(n[i]);
            }
        }
        int[] arrayE = new int[evenList.size()];
        for (int i = 0; i < arrayE.length; i++) {
            arrayE[i] = evenList.get(i);
        }

        return arrayE;

    }

}


// i   0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//    [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
// n >= 0 とする
// i = 0  int [0] = 0 を入力する　2で割る　0の場合は偶数に入れる
// i = 1  int [1] = 1 を入力する　2で割る　奇数になるので空白を入れる
// i = 2  int [2] = 2 を入力する　2で割る　偶数になるのでそのまま入れる
//
// 空のあれいりすと作る？
// for 文　lengthかな？（int i = 0; i.length; i++; ）
// forの中に　if 使って、0なら偶数に入れる、奇数なら空白を、偶数なら入れるの３パターン
//
//
//
//
//