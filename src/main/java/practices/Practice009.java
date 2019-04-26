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
        System.out.println(showFibonacci(50));

    }

    // フィボナッチ数列を返却
    public static String showFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("負の数は受け付けません");
        }

        if (n == 0) {
            return "0";
        }

        //String fibo = "";

        int f1 = 0, f2 = 1;
        String fibo = f1 + " " + f2;

    for (int f = 0; f1 + f2 <= n; f++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            fibo += " " + f;
        }

        return fibo.trim();
    }

}
