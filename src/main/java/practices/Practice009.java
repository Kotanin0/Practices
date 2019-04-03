package practices;

/**
 * フィボナッチ数列を表示する関数 showFibonacci を作成しなさい
 *
 * 引数：整数
 * 返却：その整数以下で終了するフィボナッチ数列
 *
 * 　例）引数：50
 * 　　　返却：0 1 1 2 3 5 8 13 21 34
 */

public class Practice009 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(showFibonacci(2));
    }

    // フィボナッチ数列を返却
    public static String showFibonacci(int num) {
        if(num < 0) {
            throw new IllegalArgumentException("引数の値が不正です");
        }
        if(num == 0){
            return "0";
        }

        int fib_0;
        int fib_1 = 0;
        int fib_2 = 1;
        String strFibonacci = Integer.toString(fib_1) + " " + Integer.toString(fib_2) + " ";

        while (fib_1 + fib_2 <= num) {
            fib_0 = fib_1 + fib_2;
            fib_1 = fib_2;
            fib_2 = fib_0;
            strFibonacci += fib_0;
            strFibonacci+= " ";
        }
        return strFibonacci.trim();
    }
}

