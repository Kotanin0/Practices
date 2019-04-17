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
        System.out.println(coincheck(99999));

    }

    public static String coincheck(int n) {
        if (n <= 0) {
            return "";
        }

        String coinchange = "";
        String br = System.getProperty("line.separator");

        int check = 0;
        int[] coins = {500, 100, 50, 10, 5, 1};

        for(int i = 0; i < coins.length;i++){
            if(n > coins[i]){
                check = n / coins[i];
                n %= coins[i];
                coinchange += coins[i] + "円＝" + check + "枚" + br;
            }
        }

        return coinchange.trim();
    }

}
