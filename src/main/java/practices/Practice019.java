package practices;

/**
 * 入力された整数を 日本円（小銭のみ）で支払ったときの硬貨の枚数を出力する関数
 * coincheck
 * を作成しなさい
 *
 * 例）
 * 入力：898
 * 出力：
 * 500円＝1枚
 * 100円＝3枚
 * 50円＝1枚
 * 10円＝4枚
 * 5円＝1枚
 * 1円＝3枚
 *
 */

public class Practice019 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int yen = 398;
        coincheck(yen);
    }

    public static String coincheck(int n) {
        if(n <= 0) return "";
        int[] coins = {500,100,50,10,5,1};
        int[] count = new int[coins.length];
        String result = "";
        for(int i = 0 ; i < coins.length ; i++){
            count[i] = n / coins[i];
            n %= coins[i];

            if(i < coins.length-1) {
                result += coins[i] + "円＝" + count[i] + "枚\r\n";
            }else{
                result += coins[i] + "円＝" + count[i] + "枚";
            }
        }
        System.out.println(result);
        return result;
    }
}
