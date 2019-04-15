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
        // ここはご自由にお使いください
        int num = 9;

        //String strnum = String.valueOf(num);
        //System.out.println(strnum + " " + strnum);

        String result = showKuku(num);
        System.out.println(result);
    }

    // 九九の答え
    public static String showKuku(int n) {
        String kuku;
        String kukuResult ="";
        int keisan = 0;
        if (n <= 0 || n >= 10) {
            throw new IllegalArgumentException("1～9の値を入れてください");
        } else {
            for (int i = 1; i <= 9; i++) {
                keisan = i * n;
                //kuku = String.valueOf(keisan);
                kukuResult += keisan + " ";

            }
            //後からスペース削除パターン
            //kukuResult = kukuResult.trim();
            return kukuResult.trim();
        }

    }
}
