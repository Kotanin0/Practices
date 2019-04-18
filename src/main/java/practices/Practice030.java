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
