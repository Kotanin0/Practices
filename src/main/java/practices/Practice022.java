package practices;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import static practices.Practice007.isPrime;

/**
 * 以前作成した素数判定関数を100000回実行したときの除算回数、処理時間をmsで出力しなさい
 *
 */

public class Practice022 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        long startTime = System.currentTimeMillis();

        for (int k = 1; k <= 100000; k++) {
            //007で使ったメソッドを呼び出す(デフォルトの文消しちゃったけど…)
            isPrime(k);

            long endTime = System.currentTimeMillis();
            System.out.println("除算回数" + k + "回");
            System.out.println("処理時間" + ((endTime - startTime) + "ms"));
        }
    }
    }

        /*最初は「重複しない数を生成しリスト化」の作業にわざわざこんなことをしようとしていた(自戒メモ)
        Integer[] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));
        */















