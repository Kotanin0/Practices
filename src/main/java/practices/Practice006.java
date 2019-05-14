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
        System.out.println(showKuku(10));

    }

    // 九九の答え
    public static String showKuku(int n) {

        if((n < 1 )||(n > 9)) {
            throw new IllegalArgumentException("引数の値が不正です");
        }


        int[] kuku = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String g = "";

        for (int i = 0; i < kuku.length; i++) {
            if (i == 0) {
                g += n * kuku[i];
            } else {
                g += " " + n * kuku[i];

            }


        }  return g;
    }
}

