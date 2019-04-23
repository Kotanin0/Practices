package practices;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 配列の中身を小さい順に並べ替える関数 sort を作成しなさい
 *
 * 引数：整数の配列
 * 返却：整数の配列
 *
 * 　例）引数：[0, 2, 3, 1, 9, 7, 6, 4, 5, 8]
 * 　　　返却：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 *
 */

public class Practice012 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int [] TestArray1_arg = new int[]{0, 2, 3, 1, 9, 7, 6, 4, 5, 8};
        int data[];
        data = sort(TestArray1_arg);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    // 並べ替えられた配列を返す
    //並べ替えはsortメソッドを使う。
    public static int[] sort(int[] n) {
        Arrays.sort(n);
        return n;
    }

}

/*バブルソート問題をじぶんで作ってみる*/