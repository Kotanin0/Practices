package practices;

import java.util.*;

import static java.util.Arrays.asList;

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

        int price = 1980; // 支払う価格
        int[] addCoin = {25,250}; // 追加するコイン。なければ空配列に
        int[] notUseCoin = {500}; // 使わないコイン。なければ空配列に

        coincheck(price, addCoin, notUseCoin);
    }

    public static String coincheck(int n, int[] addCoin, int[] notUseCoin) {
        if (n < 1) return "";
        String br = System.getProperty("line.separator"); // 改行コード指定
        String result = "";
        int otsuri = n;
        List<Integer> coin = new ArrayList<>(asList(500, 100, 50, 10, 5, 1));

        // 追加するコインをリストに追加
        for (int a : addCoin) coin.add(a);

        // 使わないコインをリストから除外
        for (int a : notUseCoin) coin.remove(coin.indexOf((a)));

        // リストを降順並べ替え
        coin.sort(Comparator.reverseOrder());
        System.out.println("今回使うコイン："+coin);

        int numOfCoinType = coin.size();

        for (int i = 0; i < numOfCoinType; i++) {
            // 0枚のときはすぐ次のコインに行く。コイン使用しないのでおつり再計算も不要
            if ((otsuri / coin.get(i)) == 0) continue;

            result += coin.get(i) + "円＝" + (otsuri / coin.get(i)) + "枚";
            // 最後（1円のとき）だけ処理しない部分
            if (numOfCoinType != i + 1) {
                result += br;
                otsuri %= coin.get(i); //coin円使った後のおつり
            }
        }
        System.out.println(result);

        return result;
    }

}
