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
        if (n % 4 != 0) return false;
        if (n % 100 != 0) return true;
        if (n % 400 == 0) return true;
        return false;
    }
}
