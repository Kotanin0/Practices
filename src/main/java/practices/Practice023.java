package practices;

/**
 * おそらく素数判定関数の100000回の実行速度がとても遅いはずなので、速くしなさい
 *
 */

public class Practice023 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        int divisionCount = 0;
        long startTime = System.currentTimeMillis();

        for (int k = 1; k <= 100000; k++) {

            isPrime(k);
            divisionCount = k;

        }

        long endTime = System.currentTimeMillis();
        System.out.println("除算回数" + divisionCount + "回");
        System.out.println("処理時間" + ((endTime - startTime) + "ms"));
    }


    //素数判定のメソッド定義と処理内容
    public static boolean isPrime(int n) {

        //高速なMathメソッドを利用して平方根処理。エラトステネスの篩面白かった。
        double j = Math.sqrt(n);
        if (n >= 2) {
            for (int i = 2; i < j; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("引数の値が不正です");
        }
        return false;
    }
}

