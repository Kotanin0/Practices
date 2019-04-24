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
    }
    //定義内容を見ると、014
    // うるう年ならtrue
    public static boolean isLeapYear(int n) {
        if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0 ){
            return true;
        }else{
            return false;
        }

    }
    }

