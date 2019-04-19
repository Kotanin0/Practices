package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        System.out.println(("--250円--"));
        System.out.println(coincheck(250, Coin.fiveHundred));
        System.out.println(("--25円--"));
        System.out.println(coincheck(25, Coin.fiveHundred));
        System.out.println(("--27円--"));
        System.out.println(coincheck(27, Coin.one));
    }

    public static String coincheck(int n, Coin emptyCoin) {
        if (n < 1) return "";

        String br = System.getProperty("line.separator");
        String resultStr = "";
        int someCoins;

        for (Coin coin : Coin.values()) {
            if (coin == emptyCoin) continue;
            someCoins = n / coin.getCoinNameInt();//枚数
            if (someCoins == 0) continue;
            n = n % coin.getCoinNameInt();//あまり
            resultStr += coin.getCoinNameStr() + "＝" + someCoins + "枚" + br;
        }

        if (n != 0) {
            resultStr += "残り" + n + "円返せませんでした";
        }

        return resultStr.trim();
    }

    protected enum Coin {
        fiveHundred(500, "500円"),
        twoHundredFifty(250,"250円"),
        oneHundred(100, "100円"),
        fifty(50, "50円"),
        twentyFive(25,"25円"),
        ten(10, "10円"),
        five(5, "5円"),
        one(1, "1円");

        private int coinNameInt;
        private String coinNameStr;

        Coin(int coinNameInt, String coinNameStr) {
            this.coinNameInt = coinNameInt;
            this.coinNameStr = coinNameStr;
        }

        public int getCoinNameInt() {
            return this.coinNameInt;
        }

        public String getCoinNameStr() {
            return this.coinNameStr;
        }
    }
}
