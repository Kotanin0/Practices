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
        System.out.println(showKuku(1));

    }

    // 九九の答え
    public static String showKuku(int n) {

        String multiplicationTable = "";
        String br = System.getProperty("line.separator");

        for (n = 1; n < 10; n++) {
            for (int j = 1; j < 10; j++) {
                //かっこをきれいに出すために、場合のため
                if (j == 1) {
                    multiplicationTable += "「" + n * j + " ";
                } else if (j == 9) {
                    multiplicationTable += n * j + "」" + br;
                } else {
                    multiplicationTable += n * j + " ";
                }
            }
        }
        return multiplicationTable;
    }
}
