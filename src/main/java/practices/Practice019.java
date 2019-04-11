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
//        coincheck(890);
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
