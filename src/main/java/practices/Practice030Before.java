package practices;
import java.util.Arrays;

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

public class Practice030Before {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int yen = 843;
        int[] coins = {500, 250, 100, 50, 25, 10, 5, 1};
        int[] hasCoinsFlag = {0, 1, 1, 0, 1, 1, 1, 1}; //硬貨がある場合は「1」無い場合は「0」
        String hasCoinsMessage = "";
        //硬貨の条件を表示
        for (int i = 0; i < hasCoinsFlag.length ; i++) {
            if( hasCoinsFlag[i] == 0) hasCoinsMessage += coins[i] + "円玉";
        }
        System.out.println(hasCoinsMessage + "が切れております。");
        //コインチェックメソッド呼び出し
        coinCheck(yen, coins, hasCoinsFlag);
    }

    public static String coinCheck(int n, int[] coins, int[] hasCoinsFlag) {
        if (n <= 0) return "";
        String br = System.getProperty("line.separator");
        int[] coinCount = new int[coins.length]; //配列にすることで何が何枚を単体でも返せる状態にしている。
        String coinCheckResult = "";

        Arrays.sort(coins);

        for (int i = 0; i < coins.length; i++) {
        //硬貨無い場合、またはcoinCountの値を更新しかつその値が0以下のとき余りの計算と文字列処理をスキップ。
            if (hasCoinsFlag[i] == 0 || (coinCount[i] = n / coins[i]) <= 0) continue;
            n %= coins[i];
            coinCheckResult += coins[i] + "円＝" + coinCount[i] + "枚" + br;
        }
        System.out.println(coinCheckResult.trim());
        if (n > 0) System.out.println(br + n + "円分の硬貨が不足しております。"); //1円玉が切れたときのアラートメッセージとして
        return coinCheckResult;
    }

}

/*出力結果
500円玉50円玉が切れております。
250円＝3枚
25円＝3枚
10円＝1枚
5円＝1枚
1円＝3枚
Process finished with exit code 0
 */