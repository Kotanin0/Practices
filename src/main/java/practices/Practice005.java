package practices;

/**
 * 試験の点数を入力し、対応する結果を表示する関数 showResult を作成しなさい
 * 試験の仕様は以下とする
 *
 * 引数：整数
 *
 * 返却：以下の文字列のいずれか
 * 　80点以上：優
 * 　70-79点：良
 * 　60-69点：可
 * 　59点以下：不可
 */

public class Practice005 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int result1 = 99;int result2 = 75;int result3 = 65 ;int result4 = 55;
        System.out.println(showResult(result1));
        System.out.println(showResult(result2));
        System.out.println(showResult(result3));
        System.out.println(showResult(result4));
    }

    // 試験の結果を返却する
    public static String showResult(int n) {
        if(n >= 80){
            return "優";
        }else if(n >= 70){
            return "良";
        }else if(n >= 60) {
            return "可";
        }else{
            return "不可";
        }
    }

}
