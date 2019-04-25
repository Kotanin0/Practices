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

