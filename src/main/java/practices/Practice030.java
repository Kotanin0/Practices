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
        //500円があったら1,なかったら0
        int fiveHundredStockFlag = 0;
        System.out.println(coincheck(1270, fiveHundredStockFlag));
    }

    public static String coincheck(int n, int check) {
        String br = System.getProperty("line.separator");

        //0以下の数値を空で返す
        if (0 >= n) return "";
        //コインの枚数も表示させる
        String getCoinCheck = "";
        int count = 0;
        int[] coins = {750, 500, 250, 100, 50, 25, 10, 5, 1};

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == 500 && check == 0) continue;
            if (n > coins[i]) {
                count = n / coins[i];
                n %= coins[i];
                getCoinCheck += coins[i] + "円=" + count + "枚" + br;
            }
        }
        return getCoinCheck;
    }
}