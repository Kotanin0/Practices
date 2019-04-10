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
        System.out.println(showResult(75));
    }

    // 試験の結果を返却する
    public static String showResult(int n) {
        int yuu = 80;
        int ryou = 70;
        int ka = 60;

        if (n >= yuu) return "優";
        if (n >= ryou) return "良";
        if (n >= ka) return "可";

        return "不可";
    }

}


