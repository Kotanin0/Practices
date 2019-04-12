package practices;

import java.security.PublicKey;

/**
 * おそらく素数判定関数の100000回の実行速度がとても遅いはずなので、速くしなさい
 */

public class Practice023 {
    public static void main(String[] args) {
        // ここはご自由にお使いください


        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            count += isPrime(i); //100000パターンの数字を渡している。
        }
        long end = System.currentTimeMillis();

        System.out.println("除算回数：" + count + "回");
        System.out.println("処理時間：" + (end - start) + "ms");
    }


    public static int isPrime(int n) {
        int count = 0;
        //ガード節を用いて、先に出てきそうな偶数のみカウント。
        if (n == 0){
            return 0;
        }
        if ( n > 2 && n % 2 ==0) {
            return count++;
        }

        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            count++;  //処理をやるたびに1+される。除算をやりきるイメージ。
            if (n % i == 0) {
                return count;
            }
        }
        return count;
    }

}
