package practices;

/**
 * 九九の答えを表示する関数 showKuku を作成しなさい
 * <p>
 * 引数：整数
 * 返却：以下のように、数字を半角スペースで区切ったもの
 * <p>
 * 　例）引数を1にした場合の出力は「1 2 3 4 5 6 7 8 9」
 */

public class Practice006 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(showKuku(5));
    }

    // 九九の答え
    public static String showKuku(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("自然数で入力してください");
        }
        if (n >= 10) {
            throw new IllegalArgumentException("自然数で入力してください");
        }
        //空の変数を定義
        String kakeru = "";

        //　1～９の間でｎに乗じていく、結果を変数kakeruに代入していく
        for (int i = 1; i < 10; i++) {
            kakeru += n * i + " ";
        }
        // 結果を返す、最後の空白を消す
        return kakeru.trim();
    }
}

