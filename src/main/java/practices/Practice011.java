package practices;

import Utils.ValidateUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 配列の中身を奇数と偶数に分類する関数 getOdd, getEven を作成しなさい
 * <p>
 * getOdd
 * 引数：整数の配列
 * 返却：奇数のみの配列
 * <p>
 * 　例）引数：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 　　　返却：[1, 3, 5, 7, 9]
 * <p>
 * getEven
 * 引数：整数の配列
 * 返却：偶数のみの配列
 * <p>
 * 　例）引数：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 　　　返却：[0, 2, 4, 6, 8]
 */

public class Practice011 {

    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    // 奇数のみを返す
    public static int[] getOdd(int[] n) {
        return divideIntoEvenAndOdd(n, "Odd");
    }

    // 偶数のみを返す
    public static int[] getEven(int[] n) {
        return divideIntoEvenAndOdd(n, "Even");
    }


    // 対象のリストを奇数と偶数のリストに分け、指定された方を返却する
    public static int[] divideIntoEvenAndOdd(int[] n, String target) {
        // インスタンス
        Practice002 practice002 = new Practice002();

        List<Integer> oddList = new ArrayList<Integer>();
        List<Integer> evenList = new ArrayList<Integer>();

        for (int i = 0; i < n.length; i++) {
            if (practice002.isOdd(n[i])) {
                oddList.add(n[i]);
            } else {
                evenList.add(n[i]);
            }
        }

        if ("Odd".equals(target)) return conversionList(oddList);
        if ("Even".equals(target)) return conversionList(evenList);
        else throw new IllegalArgumentException("OddかEvenを指定してね");
    }

    // Listを配列へ変換
    public static int[] conversionList(List<Integer> list){
        int[] nums = new int[list.size()];
        for(int i = 0; i < nums.length; i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}
