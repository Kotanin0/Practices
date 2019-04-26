package practices;

/**
 * 西暦を入力するとうるう年か判定する関数 isLeapYear を作成しなさい
 *
 * 引数：整数
 * 返却：true/false
 *
 */

public class Practice014 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int uru = 2000;
        System.out.println(isLeapYear(uru));

    }

    // うるう年ならtrue
    public static boolean isLeapYear(int n) {
// うるう年は2000年、2004年、…2020年　year+4
// グレゴリオ暦では 100 で割り切れる年 (1900 年など) は、400で割り切れる場合のみうるう年。
// そのため1700、1800、1900、2100、2200、2300、2500、2600はうるう年ではない。
        return (n % 4 == 0) && (n % 100 != 0 || n % 400 == 0);
    }

}