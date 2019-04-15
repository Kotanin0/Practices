package practices;

import java.sql.SQLOutput;

/**
 * フィボナッチ数列を表示する関数 showFibonacci を作成しなさい
 * <p>
 * 引数：整数
 * 返却：その整数以下で終了するフィボナッチ数列
 * <p>
 * 　例）引数：50
 * 　　　返却：0 1 1 2 3 5 8 13 21 34
 */

public class Practice009 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(showFibonacci(50));
    }

    // フィボナッチ数列を返却
    public static String showFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) {
            return "0";
        }

            int[] fibonacci = {0, 1, 1};
            String fibNumbers = "";

            fibNumbers = "0 1";

            while (fibonacci[2] <= n) {

                fibonacci[0] = fibonacci[1];
                fibonacci[1] = fibonacci[2];
                fibonacci[2] = fibonacci[0] + fibonacci[1];

                fibNumbers = fibNumbers + " " + fibonacci[1];

            }
            return fibNumbers.trim();
        }

}

//
// i =  0 1 2 3 4 5 6  7  8  9
//結果  0 1 1 2 3 5 8 13 21 34　引数　n=50の時、21+34=55になるからこれは表示しない iとは関係なく表示しなくする
// 動きのイメージ　　　
// n = 0　i = 0：「 0 」→ i = 1:「 1 」> n　だから、「 1 」はなかったことにして、「 0 」のみを表示
// n = 1　i = 0：「 0 」→ i = 1:「 1 」→ i = 2:「 1 」→ i = 3:「 2 」> n　だから、「 2 」はなかったことにして、「 0 1 1 」を表示
// n = 2　i = 0：「 0 」→ i = 1:「 1 」→ i = 2:「 1 」→ i = 3:「 2 」→ i = 4:「 3 」> n　だから、終了していっこ前までを表示
// n = 3　i = 0：「 0 」→ i = 1:「 1 」→ i = 2:「 1 」→ i = 3:「 2 」→ i = 4:「 3 」→ i = 5：「 5 」> n　だから、終了していっこ前までを表示
//
//    簡単に説明すると
//    A+B=C
//    B+C=D
//    C+D=Eということです。だって。google先生によると。
//最後に上書きしないで足していってほしい時ってどうするのだっけ i++をどのようにかくんだ。
//何回回すか決まっていない場合はwhile文使った方が書きやすい。for文は何回回すかわかっているとき。by金曜日の徳村さん
