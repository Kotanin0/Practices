package practices;
import java.util.*;


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

public class Practice011 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int[] array = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.print("配列要素：");
        for(int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
        getOdd(array);
        getEven(array);
    }

    // 奇数のみを返す
    public static int[] getOdd(int[] n) {
        ArrayList<Integer> arrayOddList = new ArrayList<Integer>();
        //新しいリストを用意して値を格納する
        for(int i = 0 ; i < n.length ; i++) {
            if (n[i] % 2 != 0) {
                arrayOddList.add(n[i]) ;
            }
        }
//リストの要素数の変数を用意して、新しい配列を宣言するのに利用、
        int size = arrayOddList.size();
//リストを配列に変換する（※けどInteger型になってしまうからそのままだと返せない）
        Integer[] arrayOdd = arrayOddList.toArray(new Integer[size]);
//このままだとreturnできないので、int型の配列を新に宣言し代入
        int [] arrayOddFinal = new int[size];
        for(int i = 0; i < size; i++) {
//確認用   System.out.println(arrayOdd[i]);
           arrayOddFinal[i] = arrayOdd[i]; //int型の配列に変更
        }
//確認用
        System.out.println(arrayOddList);
        System.out.println("要素数 = " + arrayOddList.size());
        return arrayOddFinal;
    }

    // 偶数のみを返す
    public static int[] getEven(int[] n) {
        ArrayList<Integer> arrayEvenList = new ArrayList<Integer>();
        //新しい配列に値を格納する
        for(int i = 0 ; i < n.length ; i++) {
            if (n[i] % 2 == 0) {
                arrayEvenList.add(n[i]) ;
            }
        }
        int size = arrayEvenList.size();
        Integer[] arrayEven = arrayEvenList.toArray(new Integer[size]);
        int [] arrayEvenFinal = new int[size];
        for(int i = 0; i < size; i++) {
//確認用          System.out.println(arrayOdd[i]);
            arrayEvenFinal[i] = arrayEven[i];
        }
//確認用
        System.out.println(arrayEvenList);
        System.out.println("偶数要素数 = " + arrayEvenList.size());
        return arrayEvenFinal;
    }
}
