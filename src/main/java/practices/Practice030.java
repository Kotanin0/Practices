package practices;

/**
 * Practice019 で作成した coincheck を拡張しなさい
 *
 * 仕様追加）
 * ・元号が変わったので、新しい硬貨ができました！
 * 　250円玉、25円玉
 * ・硬貨の枚数が0枚の時は、出力しなくて良い
 * ・500円玉が切れている場合があるらしいので、500円玉でかえす or かえさないを引数に追加してください
 *
 * 提出方法）
 * ・Practice019のcoincheckを、本クラスにコピーして、まずプルリクエストを出してください
 * ・その後、解いてください
 *
 */

public class Practice030 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        // n = チャックする金額、g = 500円硬貨の有無(500円有り=1, 500円無し=0)
        System.out.println(coincheck(750,0));

    }

    public static String coincheck(int n, int g) {

        int[] coin = new int[]{500, 250, 100, 50, 25, 10, 5, 1};
        int[] count = new int[coin.length];

        String check = "";
        String br = System.getProperty("line.separator");

        //1000円で割って余り無しなら小銭不要で出力無し
        if ((n <= 0) || (n % 1000 == 0)) {
            return "";
        }

        for (int i = 0; i < coin.length; i++) {
            //500円硬貨無しの場合は、最初のループ飛ばす処理追加
            if((g == 0)&&(i == 0)){continue;}
            count[i] = n / coin[i];
            //その硬貨を使った後の余り金額
            n = n % coin[i];

            check += coin[i] + "円＝" + count[i] + "枚" + br;
        }


        return check.trim();
    }
}