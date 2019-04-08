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
        String forOutput = showFibonacci(50);
        System.out.println(forOutput);

    }

    // フィボナッチ数列を返却

    public static String showFibonacci(int n) {
        if(n < 0){
            throw new IllegalArgumentException("不正な引数です");
        }

        if(n == 0){
            return "0";
        }

        //an+2 = an＋1　＋　an ※計算式
        // 0 1 1 2 3 5 8 13 21 34 55 ....
        int fib0;
        int fib1 = 0;
        int fib2 = 1;
        String sFibonacci = Integer.toString(fib1) + " " + Integer.toString(fib2) + " ";

        while (fib1 + fib2 <= n) {
            fib0 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib0;
            sFibonacci += fib0;
            sFibonacci+= " ";
        }
        return sFibonacci.trim();
    }

}
