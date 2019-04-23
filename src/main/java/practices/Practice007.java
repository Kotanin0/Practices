package practices;

/**
 * 素数を判定する関数 isPrime を作成しなさい
 * <p>
 * 引数：任意の数値
 * 返却：true/false
 */

public class Practice007 {

    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.print(isPrime(1));
    }

    // 素数判定
    public static boolean isPrime(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i <= 0) {
                return false;
            }
        }
        return true;
    }
}


//nを2～(n-1)で割り続ける。最終的にどの場合も割り切れなければ素数。
//イメージする動きはこんな感じ
//たとえば、n=9の場合　
//１．2で割る…1余り　→　n を返す
//２．3で割る…余りなし　→　-n を返す【上書き】
//３．処理終了させる。（ループしない）で
//４．結果がマイナスの場合「素数ではない」と判定
//
//たとえば、n=5の場合　
//１．2で割る…1余る　→ n を返す　同じ処理繰り返し
//２．3で割る…2余る　→ n を返す【上書き】　同じ処理繰り返し
//３．4で割る…1余る　→　n を返す【上書き】　同じ処理繰り返し
//４．予定まで終わったので処理終了
//５．結果がプラスの場合、「素数である」と判定
//
//
//まず前半でprimeっていうメソッドを作る？余りが出るまで割り続けるところまで
//n<2の場合どうするか　→　n<1は例外処理、n=1はそのままでOKだけど素数じゃない
//
//