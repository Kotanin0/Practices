package practices;

/**
 * 配列の中身を奇数と偶数に分類する関数 getOdd, getEven を作成しなさい
 *
 * getOdd
 * 引数：整数の配列
 * 返却：奇数のみの配列
 *
 * 　例）引数：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 　　　返却：[1, 3, 5, 7, 9]
 *
 * getEven
 * 引数：整数の配列
 * 返却：偶数のみの配列
 *
 * 　例）引数：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 　　　返却：[0, 2, 4, 6, 8]
 *
 */

public class Practice011ver2 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int[] array = {1,3,6,9,10};
        System.out.print("配列要素：");
        for(int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
        getOdd(array);
        System.out.println("");
        getEven(array);
    }


    public static int[] getOdd(int[] n){
        int count = 0; int k = 0;
//奇数の要素数をチェック
        for (int odd : n) {
            if (odd % 2 != 0) count++;
        }
//チェックした要素数で返す新しい配列を宣言し該当するものを代入していく
        int[] oddResult = new int[count];
        for (int i : n ) {
            if (i % 2 != 0) {
                oddResult[k++] = i;;
            }
        }
//奇数振り分け結果表示用
        System.out.println("【奇数要素】");
        for (int i = 0; i < count ; i++) {
            System.out.print(oddResult[i]+ " ");
        }
        return oddResult;
    }

    // 偶数のみを返す
    public static int[] getEven(int[] n){
        int count = 0; int k = 0;
        for (int even : n) {
            if (even % 2 == 0) count++;
        }
        int[] evenResult = new int[count];
        for (int i : n ) {
            if ( i % 2 == 0) {
                evenResult[k++] = i;
            }
        }
//偶数振り分け結果表示用
        System.out.println("【偶数要素】");
        for (int i : evenResult) {
            System.out.print(i+ " ");
        }
         return evenResult;
    }
}