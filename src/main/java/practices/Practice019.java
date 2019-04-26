package practices;

/**
 * 入力された整数を 日本円（小銭のみ）で支払ったときの硬貨の枚数を出力する関数
 * coincheck
 * を作成しなさい
 * <p>
 * 例）
 * 入力：898
 * 出力：
 * 500円＝1枚
 * 100円＝3枚
 * 50円＝1枚
 * 10円＝4枚
 * 5円＝1枚
 * 1円＝3枚
 */

public class Practice019 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(coincheck(898));
    }

    public static String coincheck(int n) {
        String br = System.getProperty("line.separator");
        //0以下の数値を空で返す
        if (0 >= n) return "";
        //各紙幣の割れる枚数を特定する。
        //割る作業をループさせる→割った数値をカウントする
        //割った後にNを更新させる
        int a500 = 0;
        int a100 = 0;
        int a50 = 0;
        int a10 = 0;
        int a5 = 0;
        int a1 = 0;

        while (n != 0) {
            while (n >= 500) {
                a500++;
                n = n - 500;
            }
            while (n >= 100) {
                a100++;
                n = n - 100;
            }
            while (n >= 50) {
                a50++;
                n = n - 50;
            }
            while (n >= 10) {
                a10++;
                n = n - 10;
            }
            while (n >= 5) {
                a5++;
                n = n - 5;
            }
            while (n >= 1) {
                a1++;
                n = n - 1;
            }
        }
        return  "500円" + "＝" + a500 + "枚" + br +
                "100円" + "＝" + a100 + "枚" + br +
                "50円" + "＝" + a50 + "枚" + br +
                "10円" + "＝" + a10 + "枚" + br +
                "5円" + "＝" + a5 + "枚" + br +
                "1円" + "＝" + a1 + "枚";
    }
}

