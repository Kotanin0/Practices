package practices;

import java.util.ArrayList;

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
        int[] test = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] date;
        date = getOdd(test);
        date = getEven(test);

    }

    // 奇数のみを返す
    public static int[] getOdd(int[] n) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                list.add(n[i]);
            }
        }
        int[] returnArray = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            returnArray[i] = list.get(i);
        }
        return returnArray;
    }

    // 偶数のみを返す
    public static int[] getEven(int[] n) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                list.add(n[i]);
            }
        }
        int[] returnArray = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            returnArray[i] = list.get(i);
        }
        return returnArray;

    }
}
