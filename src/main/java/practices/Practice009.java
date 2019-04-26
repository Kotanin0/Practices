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
        System.out.println(showFibonacci(0));
    }

    // フィボナッチ数列を返却
    public static String showFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("2以上の整数で入力してください");
        }
        int a = 0;
        int b = 1;
        int c = a + b;
        String result = a + " " + b + " ";

        if (n == 0) {
            result = "0";
        }
        while (a + b <= n) {
            //何回繰り返せばよいかよくわからない場合はwhileがお薦め
            result = result + c + " ";
            // それぞれの値を更新してwhile条件に戻る
            //while 条件の下で　c=a+bの更新を掛けないと、cが更新されない
            a = b;
            b = c;
            c = a + b;
        }

        return result.trim();
    }
}

