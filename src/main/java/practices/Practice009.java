package practices;

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
//        showFibonacci(0);

    }

    // フィボナッチ数列を返却
    public static String showFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("");
        } else {
            // フィボナッチ数列：2つ前と1つ前の和をつなげる
            int i = 0, j = 0, k = 1;
            String fibonacci = "0";
            // n=0なら即終了
            if (n == 0) {
                return fibonacci;
            } else {
                // kがnを超えるまで
                while (k <= n) {
                    // kを出力
                    fibonacci += " " + k;
                    // ここから次の文字判定
                    // iにjを代入（iが2つ前）
                    i = j;
                    // kにjを代入（jが1つ前）
                    j = k;
                    // kにi+jを代入（kがいま）
                    k = i + j;
                }
                return fibonacci;
            }
        }
    }
}
