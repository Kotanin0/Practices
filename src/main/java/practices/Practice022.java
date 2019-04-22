package practices;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

/**
 * 以前作成した素数判定関数を100000回実行したときの除算回数、処理時間をmsで出力しなさい
 */

public class Practice022 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.print(isPrime(100000));

        long startTime = System.currentTimeMillis();  // 処理前の時刻を取得
        isPrime(100000);  // 時間計測をしたい処理
        long endTime = System.currentTimeMillis();   // 処理後の時刻を取得

        System.out.println("処理時間：" + (endTime - startTime) + " ms");
    }

    // 素数判定
    public static String isPrime(int n) {

        int m = n; //回数＝要素数
        int[] randomNumber = new int[m]; //配列の宣言　randomNumberっていうm個の配列を宣言
        Random rand = new Random();      //randomNumber　にランダムな数字を入れたい
        String[] prime = new String[m];  //素数かどうかの判定結果を入れる配列の宣言
        int count = 0;                   //除算回数をカウントしたい
        String br = System.getProperty("line.separator");

        for (int j = 0; j < randomNumber.length; j++) {
            randomNumber[j] = rand.nextInt(300) -5;  //m個の配列にランダムな値（boundは上限の値）入れる
        }

        for (int i = 0; i < n; i++) {
            if (randomNumber[i] <= 0) {
                prime[i] = "throw new IllegalArgumentException()";
                continue;
            }
            if (randomNumber[i] == 1) {
                prime[i] = "false";
                continue;
            }
            for (int k = 2; k < randomNumber[i]; k++) {
                if (randomNumber[i] % k > 0) {
                    prime[i] = "素数";
                    count++;
                } else {
                    prime[i] = "NOT素数";
                    count++;
                    break;
                }
            }
        }
        return "除算回数は"+ count + "回です"+ br;
    }
}

//やりたいこと
//        100000回処理するとは
//        n=100000 の場合、n回　ランダムな数字mを処理する。
//        100000個ランダムな数字を用意する。
//        100000回の判定結果を入れる配列を用意する。
//        1回目　1個目のランダムな数字　「5」が素数かどうか判定する
//        2回目　n=3が素数かどうか判定する
//        3回目　n=100が素数かどうか判定する
//        4回目　n=100が素数かどうか判定する
//        …100000=nが素数かどうか判定するということ。
//        1を素数かどうか判定するのにi回回すけど、もう一つ変数が必要になるよ。


