package practices;

import java.util.ArrayList;

/**
 * 2以上の数値を入力し、素因数分解した結果を表示しなさい。
 *
 * 引数：整数
 * 返却：素因数を半角スペースで区切った文字列
 *
 * 　例）引数：20100
 * 　　　返却：2 2 3 5 5 67
 */

public class Practice008 {
    public static void main(String[] args) {
        System.out.println(factorization(1));

    }

    // 素因数分解
    public static String factorization(int n) {
        validator(n);

        Integer primes[]= getPrimeList(n);

        String result = "";
        for(int i = 0; i < primes.length; i++){
            while(n % primes[i] == 0){
                result += primes[i] + " ";
                n = n / primes[i];
            }
        }

        return result.trim();
    }

    //素因数分解に必要な、素数の配列を返却する
    public static Integer[] getPrimeList(int n){
        //インスタンス
        Practice007 practice007 = new Practice007();

        //素数判定
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++){
            if(practice007.isPrime(i)){
                primeList.add(i);
            }
        }

        //Listを配列に変換
        Integer resultList[] = primeList.toArray(new Integer[primeList.size()]);
        return resultList;
    }

    //不正な数で例外をスロー
    public static void validator(int n){
        if(n < 2){
            throw new IllegalArgumentException("不正な数字です");
        }
    }
}
