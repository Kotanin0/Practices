package practices;

/**
 * 試験の点数を入力し、対応する結果を表示する関数 showResult を作成しなさい
 * 試験の仕様は以下とする
 * <p>
 * 引数：整数
 * <p>
 * 返却：以下の文字列のいずれか
 * 　60点以上：合格
 * 　59点以下：不合格
 */

public class Practice004 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(showResult(60));
         }

    // 試験の結果を返却する
    public static String showResult(int n) {
        if (n >= 60) {
            return "合格";
        } else {
            return "不合格";
        }
    }
}
