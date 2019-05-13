package practices;

/**
 * 入力された文字の中に "ge" という文字列が含まれているか判定する関数 ge を作成しなさい
 *
 * 引数：文字列
 * 返却：true/false
 *
 */

public class Practice015 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    // "ge" という文字列が含まれているならtrue
    public static boolean ge(String str) {

        //ガード節
        return str.contains("ge");

    }

}
