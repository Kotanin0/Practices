package practices;

/**
 * 入力された整数を 日本円（小銭のみ）で支払ったときの硬貨の枚数を出力する関数
 * coincheck
 * を作成しなさい
 * <p>
 * 例）
 * 入力：898
 * 出力：
 * 500円＝1枚
 * 100円＝3枚
 * 50円＝1枚
 * 10円＝4枚
 * 5円＝1枚
 * 1円＝3枚
 */

public class Practice019 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        coincheck(897);
    }

    public static String coincheck(int n) {
        String br = System.getProperty("line.separator");
        int[] coinType = {500, 100, 50, 10, 5, 1};
        int[] numberOfCoin = {0, 0, 0, 0, 0, 0};
        String showCoinCheck = "";
        if (n <= 0) {
            return "";
        } else {
            for (int i = 0; i < coinType.length; i++) {
                if (i != 5) {
                    numberOfCoin[i] = n / coinType[i];
                    n = n % coinType[i];
                } else {
                    numberOfCoin[i] = n / coinType[i];
                }
            }
            for (int i = 0; i < coinType.length; i++) {
                if (i == 0) {
                    showCoinCheck = coinType[i] + "円＝" + numberOfCoin[i] + "枚" + br;
                } else if (i != 5) {
                    showCoinCheck = showCoinCheck + coinType[i] + "円＝" + numberOfCoin[i] + "枚" + br;
                } else {
                    showCoinCheck = showCoinCheck + coinType[i] + "円＝" + numberOfCoin[i] + "枚";
                }
            }
        }
        return showCoinCheck;
    }
}


// n を　500で割る　
// n / 500 -> 500円硬貨の枚数として出力
// n % 500 -> nに入力する　
// n / 100 -> 100円硬貨の枚数として出力
// n % 100 -> nに入力する　
// n / 50 ->  50円硬貨の枚数として出力
// n % 50 -> nに入力する　
// n / 10 -> 10円硬貨の枚数として出力
// n % 10 -> nに入力する　
// n / 5 ->  5円硬貨の枚数として出力
// n % 5 ->  1円硬貨の枚数として出力