package practices;

/**
 * 西暦を入力するとうるう年か判定する関数 isLeapYear を作成しなさい
 * <p>
 * 引数：整数
 * 返却：true/false
 */

public class Practice014 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    // うるう年ならtrue
    public static boolean isLeapYear(int n) {
//        西暦年が4で割り切れる年は(原則として)閏年。
//        ただし、西暦年が100で割り切れる年は(原則として)平年。
//        ただし、西暦年が400で割り切れる年は必ず閏年。by Wikipedia
        if (n % 400 == 0) return true;
        if (n % 100 == 0) return false;
        if (n % 4 == 0) return true;
        return false;
    }

}
