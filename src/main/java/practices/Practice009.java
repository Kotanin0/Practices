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
        System.out.println(showFibonacci(12));

    }

    // フィボナッチ数列を返却
    public static String showFibonacci(int n) {
        if (0 > n) throw new IllegalArgumentException("割り切れない");
        if (0 == n) return "0";

        int a1 = 0;
        int a2 = 1;
        int a3 = a1 + a2;
        String answer = a1 + " " + a2 + " ";

        while (a1 + a2 <= n) {
            a3 = a1 + a2;
            answer += a3 + " ";
            a1 = a2;
            a2 = a3;
        }
        return answer.trim();
    }
}
