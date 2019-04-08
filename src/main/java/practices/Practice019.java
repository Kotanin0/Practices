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
        System.out.println(coincheck(99999));
    }

    public static String coincheck(int n){
        if (n <= 0) return "";

        int[] monetaryUnit = {500,100,50,10,5,1};//貨幣の種類
        int[] returnCoin =   {  0,  0, 0, 0,0,0};//貨幣単位ごとの枚数を格納する

        //500円はnを500で割ったときの商
        returnCoin[0] = n / monetaryUnit[0];

        //500円未満は、1つ前の貨幣の剰余の商
        for (int i = 1; i < monetaryUnit.length; i++) {
            returnCoin[i] = (n % monetaryUnit[i-1]) / monetaryUnit[i];
        }

        //返り値作成
        String returnStr = "";
        String br = System.getProperty("line.separator");
        int j;
        for (j = 0; j < monetaryUnit.length-1; j++) {
            if (returnCoin[j] != 0) {
                returnStr += monetaryUnit[j] + "円" + "＝" + returnCoin[j] + "枚" + br;
            }
        }
        //最後は改行なし
        returnStr += monetaryUnit[j] + "円" + "＝" + returnCoin[j] + "枚";
        return returnStr;
    }
}
