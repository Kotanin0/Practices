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
        //mainではチェックしたいpriceとコインの在庫有無を入力する。
        //あくまでもcoinCheckは硬貨の枚数のみをカウントするメソッド

        int yen = 843;
        CoinsStatus coinsStatus = new CoinsStatus();
//在庫が無い硬貨のみ入力する。基本はフラグは"1"がたっている。
        coinsStatus.setCoinsStatus(500, 0);
        coinsStatus.setCoinsStatus(50, 0);
        coinCheck(yen, coinsStatus);
    }

    public static String coinCheck(int n, CoinsStatus coinsStatus) {
        if (n <= 0) return "";
        String br = System.getProperty("line.separator");

        int[][] coins = coinsStatus.getCoinsStatus();
        int[] coinCount = new int[coins.length];
        String coinCheckResult = "";

        for (int i = 0; i < coins.length; i++) {
            if (coins[i][1] == 0) {
                System.out.println(coins[i][0] + "円玉が切れています");
                continue;
            }
            if ((coinCount[i] = n / coins[i][0]) <= 0) continue;
            n %= coins[i][0];
            coinCheckResult += coins[i][0] + "円＝" + coinCount[i] + "枚" + br;
        }

        System.out.println(coinCheckResult.trim());
        if (n > 0) System.out.println(br + n + "円分の硬貨が不足しております。"); //1円玉が切れたときのアラートメッセージとして
        return coinCheckResult;
    }
}

//coinのステータスを管理。｛硬貨,ストック有無フラグ｝基本は"1"
class CoinsStatus {
    private int[][] coinsStatus = {{500, 1}, {250, 1}, {100, 1}, {50, 1}, {25, 1}, {10, 1}, {5, 1}, {1, 1}};

    public int[][] getCoinsStatus() {
        return this.coinsStatus;
    }

    public void setCoinsStatus(int coin, int coinStockFlag) {
        if (coinStockFlag == 0 || coinStockFlag == 1) {
            for (int i = 0; i < this.coinsStatus.length; i++) {
                if (this.coinsStatus[i][0] == coin) this.coinsStatus[i][1] = coinStockFlag; //該当する硬貨のフラグを変更する
            }
        }else{
            System.out.println(coin + "円を正しいフラグに変更してください。在庫があると仮定し計算しています。");
        }
    }
}

/**
 * 修正後出力結果
 * 500円玉が切れています
 * 50円玉が切れています
 * 250円＝3枚
 * 25円＝3枚
 * 10円＝1枚
 * 5円＝1枚
 * 1円＝3枚
 */


/*修正前出力結果
500円玉50円玉が切れております。
250円＝3枚
25円＝3枚
10円＝1枚
5円＝1枚
1円＝3枚
Process finished with exit code 0
 */