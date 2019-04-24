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
        coincheck(1890);
    }

    public static String coincheck(int n) {
        if (n < 1) return "";
        String br = System.getProperty("line.separator"); // 改行コード指定
        String result = "";
        int otsuri = n;
        int[] coin = {500, 100, 50, 10, 5, 1};
        for (int i = 0; i < coin.length; i++) {
            result += coin[i] + "円＝" + (otsuri / coin[i]) + "枚";
            // 最後（1円のとき）だけ処理しない部分
            if (coin.length != i + 1) {
                result += br;
                otsuri = otsuri % coin[i]; //coin円使った後のおつり
            }
        }
        System.out.println(result);

        return result;
    }

}
