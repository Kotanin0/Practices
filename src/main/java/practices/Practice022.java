package practices;

/**
 * 以前作成した素数判定関数を100000回実行したときの除算回数、処理時間をmsで出力しなさい
 *
 */

public class Practice022 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        long start = System.currentTimeMillis();
        int count = 0;

        for(int i=1; i<=100000; i++) {
            count += Practice007.isPrimeForPractice22(i);
            //System.out.println("実行回数"+ i +"回目（引数）：累計除算回数："+ count);
        }
        long end = System.currentTimeMillis();
        System.out.println("徐算回数"+ count + "回");
        System.out.println("処理時間：" + (end - start) + "ms");
        System.out.println();


    }

    //途中出力した場合：3093ms
    //途中出力しない場合：1781ms
}
