package practices;

/**
 * Practice019 で作成した coincheck を拡張しなさい
 * <p>
 * 仕様追加）
 * ・元号が変わったので、新しい硬貨ができました！
 * 　250円玉、25円玉
 * ・硬貨の枚数が0枚の時は、出力しなくて良い
 * ・500円玉が切れている場合があるらしいので、500円玉でかえす or かえさないを引数に追加してください
 * <p>
 * 提出方法）
 * ・Practice019のcoincheckを、本クラスにコピーして、まずプルリクエストを出してください
 * ・その後、解いてください
 */

public class Practice030 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

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