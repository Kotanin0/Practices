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
//        int[] n = new int[]{1,3,5,7,9};
//        getEven(n);

    }

    // 奇数のみを返す
    public static int[] getOdd(int[] n) {
        // 要素数がわからないのでListに入れてく
        ArrayList<Integer> list = new ArrayList<Integer>();
        ;
        // 配列を１つめから順番にとりだす
        // 奇数か偶数かチェックする（２でわってあまりが０か１か）
        for (int array : n) {
            // 奇数だったら新しい配列にいれる
            if (array % 2 == 1) {
                list.add(array);
            }
            // 偶数だったら何もしない
        }
        // listのサイズで配列intArrayを作って、１つずつ入れてく
        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            intArray[i] = list.get(i);
        return intArray;
    }

    // 偶数のみを返す
    public static int[] getEven(int[] n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ;
        for (int array : n) {
            if (array % 2 == 0) {
                list.add(array);
            }
        }
        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            intArray[i] = list.get(i);
        return intArray;
    }

}
