package practices;

import java.util.Random;

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

        Random random = new Random();
        // ここはご自由にお使いください

        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(5000);
            System.out.println(n);
            int y = random.nextInt(2);
            String x =( y == 1 ? "500円切れ" : "500円有り");
            System.out.println(x);
            System.out.println(coincheck(n, x));
        }

    }

    public static String coincheck(int n, String y) {

        //コインの種類
        int[] coin = {500, 250, 100, 50, 25, 10, 5, 1};
        int[] coinNumber = new int[8];
        String oneCoinPrinter = "";
        String totalCoinPrinter = "";
        //改行コード
        String br = System.getProperty("line.separator");

        if (n <= 0) {
            totalCoinPrinter = "";
            //500円が切れているかどうか
            //500円切れの場合
        } else {
            if (y == "500円切れ") {
                for (int i = 1; i < coin.length; i++) {
                    coinNumber[i] = n / coin[i];
                    n = n % coin[i];
                    //枚数が0枚だったら、出力しない。
                    if (coinNumber[i] == 0) {
                        continue;
                    } else {
                        oneCoinPrinter = coin[i] + "円" + "＝" + coinNumber[i] + "枚";
                        totalCoinPrinter = totalCoinPrinter + oneCoinPrinter + br;
                    }
                }
          //500円がある場合
            } else {
                for (int i = 0; i < coin.length; i++) {
                    coinNumber[i] = n / coin[i];
                    n = n % coin[i];
                    //枚数が0枚だったら、出力しない。
                    if (coinNumber[i] == 0) {
                        continue;
                    } else {
                        oneCoinPrinter = coin[i] + "円" + "＝" + coinNumber[i] + "枚";
                        totalCoinPrinter = totalCoinPrinter + oneCoinPrinter + br;
                    }
                }
            }
        }
        return totalCoinPrinter.trim();
    }
}


