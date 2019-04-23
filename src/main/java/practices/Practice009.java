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
            throw new IllegalArgumentException("不正な引数です");
        }

        int fib0;
        int fib1 = 0;
        int fib2 = 1;
        String sFibonacci = Integer.valueOf(fib1) + " " + Integer.valueOf(fib2) + " ";

        while (fib1 + fib2 <= n) {
            fib0 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib0;
            sFibonacci += fib0;
            sFibonacci += " ";
        }
        return sFibonacci.trim();
    }
}

/*
    public static int getFibonacci(int i) {
    switch ( i ) {
        case 0: return 0;
        case 1: return 1;
        default: return getFibonacci( i - 2 ) + getFibonacci( i - 1 );
    }
    }*/

