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
        System.out.println(coincheck(-200));
    }

    public static String coincheck(int n) {

        int a = n / 500;//500円の枚数
        int b = n % 500;
        int c = b / 100;//100円の枚数
        int d = b % 100;
        int e = d / 50;//50円の枚数
        int f = d % 50;
        int g = f / 10;//10円の枚数
        int h = f % 10;
        int i = h / 5;//5円の枚数
        int j = h % 5;//1円の枚数

        String br = System.getProperty("line.separator");//環境依存せずに改行コードを取得している

        if (n > 0) {
            return "500円＝" + a + "枚" + br + "100円＝" + c + "枚" + br + "50円＝" + e + "枚" + br + "10円＝" + g + "枚" + br + "5円＝" + i + "枚" + br + "1円＝" + j + "枚";
        } else {
            return "";

        }
    }
}
