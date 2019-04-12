package practices;

/**
 * おそらく素数判定関数の100000回の実行速度がとても遅いはずなので、速くしなさい
 * 目標数十ms
 */

public class Practice023 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        long start = System.currentTimeMillis();
        int count = 0;
        int i;
        for (i = 1; i <= 100000; i++) {
            count += isPrime23(i);
//            System.out.println("実行回数"+ i +"回目（引数）：累計除算回数："+ count);
        }


        long end = System.currentTimeMillis();
        System.out.println("徐算回数" + count + "回");
        System.out.println("処理時間：" + (end - start) + "ms");
        System.out.println();
    }

    public static int isPrime23(int n) {
        if(n < 2) return 0;
        if(n == 2) return 1;
        if(n % 2 == 0) return 1;  // 偶数はあらかじめ除く

        double sqrtNum = Math.sqrt(n);
        int count = 0;
        //平方根より下回る値は徐算する（余りを求める）必要がない＆2の倍数は除外しているので2ずつカウント
        for (int i = 3; i <= sqrtNum ; i += 2) {
            count ++;
            if (n % i == 0){
                return count; //ここで返す＝素数ではないということ
            }
        }
        return count;        //ここで返す＝素数であるということ
    }
}

//徐算回数1395442回
//処理時間：15ms