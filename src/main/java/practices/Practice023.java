package practices;

import java.util.*;

/**
 * おそらく素数判定関数の100000回の実行速度がとても遅いはずなので、速くしなさい
 */

//      平方根使用前
//        素数リスト作成時の除算：771632回
//        100,000回試行したときの素数：12336個
//        46ms
//      平方根使用後
//        素数リスト作成 15ms
//        100,000回素数チェック 16ms
//        素数リスト作成時の除算：38754回
//        100,000回試行したときの素数：12400個


public class Practice023 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        // 投入する素数の上限値
        int maxPrime = 10000;

        int countPrime[];
        countPrime = primeList(maxPrime);

        System.out.println("素数リスト作成時の除算：" + countPrime[0] + "回");
        System.out.println("100,000回試行したときの素数：" + countPrime[1] + "個");
    }

    // 素数リスト作る
    public static int[] primeList(int n) {
        long start = System.currentTimeMillis(); // 処理開始時間

        // count[除算の回数, 素数の数] を格納していく
        int count[] = new int[2];
        List<Integer> list = new ArrayList<Integer>(100);

        // 2を格納する
        list.add(2);
        // 3以降はリストの数字で割れなければ素数→listに格納

        // iは素数チェック対象（奇数だけ）
        // jは（既に格納した）リストから取り出す要素番号
        double sqrt;
        int listNum, listSize;
        loop:
        for (int i = 3; i < n; i += 2) {
            sqrt = Math.sqrt(i);
            listSize = list.size();
            for (int j = 0; j < listSize; j++) {
                // 平方根以上の値ではチェック不要
                listNum = list.get(j);
                if (listNum > sqrt) {
                    continue;
                }
                count[0]++;
                if (i % listNum == 0) {
                    continue loop;
                }
            }
            list.add(i);
        }
        // 素数ちゃんと入ってるか確認用
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("素数リストの数" + list.size());
        long lap = System.currentTimeMillis(); // リスト作成終了時間
        System.out.println("素数リスト作成 " + (lap - start) + "ms");

        // 100000回の素数チェック
        Set<Integer> set = new HashSet<Integer>(list);
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            count[1] += isPrime(set, random.nextInt(n));
        }

        long end = System.currentTimeMillis(); // 処理終了時間
        System.out.println("100,000回素数チェック " + (end - lap) + "ms");

        return count;
    }

    public static int isPrime(Set<Integer> set, int n) {
        if (n <= 1) return 0;
        if (set.contains(n)) return 1;
        return 0;
    }

    public static int[] primeListSet(int n) {
// set使って素数リスト作成
// 素数リスト作成時の除算：784446回
// 125ms →遅かった

        int count[] = new int[2];

        // 2を格納する
        // 3以降はset内の数字jで割れるかチェック
        // 割れなければ素数→setに格納
        Set<Integer> set = new HashSet<Integer>();

        set.add(2);
        // iは素数チェック対象（奇数だけ）
        loop:
        for (int i = 3; i < n; i = i + 2) {
            for (Integer j : set) {
                count[0]++;
                if (i % j == 0) {
                    continue loop;
                }
            }
            set.add(i);
        }
        // 素数ちゃんと入ってるか確認用
        for (int j : set) {
            System.out.println(j);
        }
        System.out.println(count[0]);

        // 100000回の素数チェック
//        Random random = new Random();
//        for (int i = 0; i < 100000; i++) {
//            count[1]+=isPrime(list, random.nextInt(n));
//        }

        return count;
    }
}
