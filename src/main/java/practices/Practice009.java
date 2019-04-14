package practices;

import Utils.ValidateUtils;

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
        System.out.println(showFibonacci(50));

    }

    // フィボナッチ数列を返却
    public static String showFibonacci(int n) {
        // 正の整数チェック
        ValidateUtils validation = new ValidateUtils();
        validation.checkPositiveInteger(n);

        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;

        // 0の時だけ規則に当てはまらないので分岐
        if (n == 0) {
            return String.valueOf(n1);
        }

        // フィボナッチ数列を生成
        String fibonacci = n1 + " " + n2 + " ";
        while (n1 + n2 <= n) {
            fibonacci += n3 + " ";
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }

        return fibonacci.trim();
    }
}
