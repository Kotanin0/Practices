package practices;

import java.util.Arrays;

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


    public static int[] getOdd(int[] array) {
        return Arrays.stream(array)
                .filter(NumberExtension::isOdd)
                .toArray();
    }

    public static int[] getEven(int[] array) {
        return Arrays.stream(array)
                .filter(NumberExtension::isEven)
                .toArray();

    }
}




/*


        int[] numberArrayList = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int data[];

        data = getOdd(numberArrayList); //なんの変数を渡すかを決める。()は。
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }


    //()内を要求している。　　今回はint型の配列を返すといっている。
    public static int[] getArrayList(ArrayList<Integer> X) {
        int[] returnList = new int[X.size()];
        for (int i = 0; i < X.size(); i++) {
            returnList[i] = X.get(i); // Integer
        }
        return returnList;
    }

    // 奇数のみを返す
    public static int[] getOdd(int[] n) {
        //int型の配列で奇数のみをとるarrayOddを定義する。
        //arrayOddは 箱に数字を入れていく。
        ArrayList<Integer> arrayOdd = new ArrayList<Integer>();
        int i;
        int j = 0;
        for (i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                arrayOdd.add(n[i]);
                j++;
            }
        }
        //返す時にint型に変更しないといけない。
        // ArrayLst_toArrayメソッドに配列arrayOddを渡す
        int[] X = getArrayList(arrayOdd);
        return X;

    }

    // 偶数のみを返す
    public static int[] getEven(int[] n) {
        ArrayList<Integer> arrayEven = new ArrayList<Integer>();
        int i;
        int j = 0;
        for (i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                arrayEven.add(n[i]);
                j++;
            }
        }
        return getArrayList(arrayEven);
    }

*/