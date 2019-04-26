package practices;

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
        int[] a = {1, 2, 3, 4, 5};

        //拡張for文
        int[] answer = getOdd(a);
        for (int x : answer) {
            System.out.println(x);
        }
    }
        //forの中にgetOddを入れると毎回抜き出しレ来るから遅い
        //for (int x : getOdd(a)) {
        //    System.out.println(x);
        //}

        //if文なら
        //int[] answer = getOdd(a);
        //for (int i = 0; i < answer.length; i++) {
        //    System.out.println(answer[i]);
        //}

    // 奇数のみを返す
    public static int[] getOdd(int[] n) {
        return Arrays.stream(n)
                .filter(i -> i % 2 != 0)
                .toArray();
    }

    // 偶数のみを返す
    public static int[] getEven(int[] n) {
        return Arrays.stream(n)
                .filter(i -> i % 2 == 0)
                .toArray();
    }
}