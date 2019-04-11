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
        System.out.println(coincheck(898));

    }

    public static String coincheck(int n) {
        // 引数が0以下の場合は空文字
        if(n < 1) return "";

        // 固定値の定義
        String br = System.getProperty("line.separator");

        //コインチェック
        String resultMessage = "";
        for(Coin coin : Coin.values()){
          int count = 0;
          while(n - coin.getAmount() >= 0){
              count++;
              n -= coin.getAmount();
          }
          resultMessage += coin.getLabel() + "＝" + count + "枚" + br;
        }

        return resultMessage.trim();
    }

    // コインのEnum（Enumを使いたかったという気持ち）
    protected enum Coin {
        fiveHundred(500, "500円"),
        hundred(100, "100円"),
        fifty(50, "50円"),
        ten(10, "10円"),
        five(5, "5円"),
        one(1, "1円");

        // フィールド定義
        private int amount;
        private String label;

        // コンストラクタ定義
        Coin(int amount, String label) {
            this.amount = amount;
            this.label = label;
        }

        // げったー
        public int getAmount(){
            return this.amount;
        }
        public String getLabel(){
            return this.label;
        }
    }
}
