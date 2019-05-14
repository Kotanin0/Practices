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
        //うるう年→4で割り切れる年。ただし、そのうち100で割り切れて400で割り切れない年は平年扱い
    }

    // うるう年ならtrue
    public static boolean isLeapYear(int n) {

        //ガード節
        return (n%4==0 && !(n%100==0 && n%400!=0));

        }




}
