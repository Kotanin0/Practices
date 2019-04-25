package practices;

/**
 * 入力された文字の中に "ge" という文字列が含まれているか判定する関数 ge を作成しなさい
 * <p>
 * 引数：文字列
 * 返却：true/false
 */

public class Practice015 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    // "ge" という文字列が含まれているならtrue
    public static boolean ge(String str) {
        int result = str.indexOf("ge"); // 指定した文字列がある先頭の位置(0 から開始)、見つからない場合は-1
        return result != -1;
    }

}
