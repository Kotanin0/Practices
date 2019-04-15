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
        //フィボナッチ数列→「前の２つの数を加えると次の数になる」数列。ただし最初は「1,1」
        System.out.println(showFibonacci(0));

    }

    // フィボナッチ数列を返却
    public static String showFibonacci(int n) {
        if (0 > n) throw new IllegalArgumentException("負の数は受け付けません");

        int a0, a1, ag;
        String fb = " ";
        a0 = 0;
        a1 = 1;
        if(n > 0){
        fb = String.valueOf(a0) + " " + String.valueOf(a1);}
        else {
            a0 = 0;
            fb = String.valueOf(a0);}


        for (int i = 1; i <= n; ++i) {
            ag = a0 + a1;
            if(ag > n){break;}
            fb = fb + " " + String.valueOf(ag);
            a0 = a1;
            a1 = ag;
        }


        return fb.trim();
    }

}
