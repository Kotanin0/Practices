package practices;

/**
 * 九九の答えを表示する関数 showKuku を作成しなさい
 *
 * 引数：整数
 * 返却：以下のように、数字を半角スペースで区切ったもの
 *
 * 　例）引数を1にした場合の出力は「1 2 3 4 5 6 7 8 9」
 */

public class Practice006 {
    public static void main(String[] args) {
        System.out.println(showKuku(9));
    }

    // 九九の答え
    public static String showKuku(int n) {
        if (n < 1 || n > 9){
            throw new IllegalArgumentException();
        }

        String answer = "";
        for(int i = 1; i < 10; i++){
            answer += n * i + " ";
        }
        return answer.trim();
    }

}
