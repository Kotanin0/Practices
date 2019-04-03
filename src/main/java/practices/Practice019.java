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
        System.out.println(coincheck(1));
    }

    public static String coincheck(int n) {
        String br = System.getProperty("line.separator");
        String expected = "500円＝1枚" + br +
                "100円＝3枚" + br +
                "50円＝1枚"  + br +
                "10円＝4枚"  + br +
                "5円＝1枚"   + br +
                "1円＝3枚";

        return expected;
    }

}
