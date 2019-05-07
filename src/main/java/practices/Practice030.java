package practices;

/**
 * Practice019 で作成した coincheck を拡張しなさい
 *
 * 仕様追加）
 * ・元号が変わったので、新しい硬貨ができました！
 * 　250円玉、25円玉
 * ・硬貨の枚数が0枚の時は、出力しなくて良い
 * ・500円玉が切れている場合があるらしいので、500円玉でかえす or かえさないを引数に追加してください
 *
 * 提出方法）
 * ・Practice019のcoincheckを、本クラスにコピーして、まずプルリクエストを出してください
 * ・その後、解いてください
 *
 */

public class Practice030 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(coincheck(898));

    }

    public static String coincheck(int n) {
        int[] count = new int[]{0, 0, 0, 0, 0, 0};
        int[] coin = new int[]{500, 100, 50, 10, 5, 1};

        String check = "";
        String br = System.getProperty("line.separator");

        if (n <= 0) {
            return "";
        }

        for (int i = 0; i < coin.length; i++) {
            //その硬貨を使う枚数
            count[i] = n / coin[i];
            //その硬貨を使った後の余り金額
            n = n % coin[i];

            check += coin[i] + "円＝" + count[i] + "枚" + br;
        }


        return check.trim();
    }
}
