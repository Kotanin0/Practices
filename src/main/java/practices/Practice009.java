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
        int a = 50;
        System.out.println(showFibonacci(a));
    }

    // フィボナッチ数列を返却
    public static String showFibonacci(int n) {
        int f1 = 0; int f2 = 1;
        //数式メモnt fn = f(n-1) + f(n-2)
        if(n < 0 ){
            throw new IllegalArgumentException("引数の値が不正です");
        } else if (n == 0) {
            return "0";
        }else if(n == 1) {
            return f1 + " " + f2;
        }else{
            String fiboArray = f1 +" " + f2;
            while( f1 + f2 <= n ){
                int fibo = f1 + f2; // 加算結果1 = 0 + 1
                fiboArray += " " + fibo;
                f1 = f2; // f2を1つ目の加算変数に代入
                f2 = fibo; //加算結果を2つ目の加算用変数に代入
            }
            return fiboArray;
        }
    }
}