package practices;

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
        // ここはご自由にお使いください
        int coin = 858;
        int[] coinName = {500, 250, 100, 50, 25, 10, 5, 1};
        int[] hasCoin = {0, 1, 1, 1, 1, 1, 1, 1};  //500円がない場合を引数に追加。
        System.out.println("商品金額");
        System.out.println(coincheck(coin, coinName, hasCoin));

    }

    public static String coincheck(int coin, int[] coinName, int[] hasCoin) {
        if (coin <= 0) return "";
        String br = System.getProperty("line.separator"); //段落
        String strReturn = ""; //空箱
        int[] count = new int[coinName.length];

        for (int i = 0; i < coinName.length; i++) {
            //コインが0枚の場合または、coinCountが0以下のときは余りの計算をスキップする。
            if (hasCoin[i] == 0 || (count[i] = coin / coinName[i]) <= 0) continue;
            coin %= coinName[i];
            strReturn += coinName[i] + "円＝" + count[i] + "枚" + br;
        }
        return strReturn.trim();
    }

}
