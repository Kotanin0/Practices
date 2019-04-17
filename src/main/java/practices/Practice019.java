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
        // 金額÷大きい硬貨(その枚数出す)、次に、余り部分の金額÷次に大きい硬貨、を繰り返して最終的に余りなしでOKか
        System.out.println(coincheck(898));

    }

    public static String coincheck(int n) {
        int[] count = new int[]{0, 0, 0, 0, 0, 0};
        int[] coin = new int[]{500, 100, 50, 10, 5, 1};

        String check = "";
        String br = System.getProperty("line.separator");

        if (n <= 0) {
            return "";
        }

        for (int i = 0; i < coin.length; i++) {
            //その硬貨を使う枚数
            count[i] = n / coin[i];
            //その硬貨を使った後の余り金額
            n = n % coin[i];

            check += coin[i] + "円＝" + count[i] + "枚" + br;
        }


        return check.trim();
    }
}


