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
