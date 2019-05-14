package practices;

/**
 * 試験の点数を入力し、対応する結果を表示する関数 showResult を作成しなさい
 * 試験の仕様は以下とする
 * <p>
 * 引数：整数
 * <p>
 * 返却：以下の文字列のいずれか
 * 　80点以上：優
 * 　70-79点：良
 * 　60-69点：可
 * 　59点以下：不可
 */

public class Practice005 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    // 試験の結果を返却する
    public static String showResult(int n) {

        //ガード節に変更し、カッコの数も減らした
        if (n >= 80) return "優";
        if (80 > n && n >= 70) return "良";
        if (70 > n && n >= 60) return "可";

        return "不可";


        /* リファクタ前の記述
        if (n >= 80) {
            return "優";
        } else if ((80 > n) && (n >= 70)) {
            return "良";
        } else if ((70 > n) && (n >= 60)){
            return "可";
        } else{
            return "不可";
        }

         */
    }

}
