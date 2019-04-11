package practices;

import java.util.ArrayList;
import java.util.Arrays;


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

        int[] o = {0,1,2,3,4,5,6,7,8,9};
        getOdd(o);
        getEven(o);


    }

    // 奇数のみを返す
    public static int[] getOdd(int[] n) {

        ArrayList<Integer> ks = new ArrayList<Integer>();
        int[] a;



        for (int n1 : n) {

            if (n1 % 2 == 0) {
                continue;
            } else {
                ks.add(n1);
            }
        }
        int[] j = new int[ks.size()];
        for (int i = 0; i < ks.size(); i++) {
            j[i] = ks.get(i);
        }


        a = j;
        return a;

    }


    // 偶数のみを返す

    public static int[] getEven(int[] n) {

        int[] b;
        ArrayList<Integer> gs = new ArrayList<Integer>();



        for (int n2 : n) {

            if (n2 % 2 == 0) {
                gs.add(n2);
            } else {
                continue;
            }

        }
        int[] m = new int[gs.size()];
        for (int i = 0; i < gs.size(); i++) {
            m[i] = gs.get(i);
        }

        b = m;
        return b;
    }
}





