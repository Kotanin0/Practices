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


        int[] m = {500, 100, 50, 10, 5, 1};
        int[] p = new int[6];
        String t = "";
        String k = "";
        String br = System.getProperty("line.separator");

        if (n <= 0) {

            k = "";

        } else {

            for (int i = 0; i < m.length; i++) {
                p[i] = n / m[i];
                n = n % m[i];
            }

            for (int i = 0; i < m.length; i++) {
                t = m[i] + "円" + "＝" + p[i] + "枚";
                k = k + t + br;

            }

        }

        return k.trim();


    }


}
