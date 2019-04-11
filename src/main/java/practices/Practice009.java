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
        showFibonacci(0);

    }

    // フィボナッチ数列を返却
    public static String showFibonacci(int n) {
        int x = 0;
        int y = 1;
        int z = 0;
        int i = 0;
        String a = "";

        if(n == 0){

            return "0";

        }else{

            while (i <= n) {
                z = x + y;
                x = y;
                y = z;
                a = a + " " + Integer.toString(z);
                i = x + y;
            }
             return "0" + " " + "1" + a;
        }


    }


}
















