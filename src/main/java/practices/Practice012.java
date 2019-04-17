package practices;
import java.util.*;

/**
 * 配列の中身を小さい順に並べ替える関数 sort を作成しなさい
 *
 * 引数：整数の配列
 * 返却：整数の配列
 *
 * 　例）引数：[0, 2, 3, 1, 9, 7, 6, 4, 5, 8]
 * 　　　返却：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 *
 */

public class Practice012 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int[] ex = {2, 9, 1, 0, -7, 6}; //コ
//渡す配列の表示
        System.out.println("実行前：");
        printData(ex);
        sort(ex);
//実行結果の表示
        System.out.println("実行後：");
        printData(ex);

    }

// 並べ替えられた配列を返す
    public static int[] sort(int[] n) {
//Arrayクラスのソートを使用した場合
        Arrays.sort(n); //プリミティブ型の配列は昇順しかソートできない。
        return n;
    }


// ライブラリ使わず
/*バブルソートで並び替えする場合
        for(int i = 0; i < n.length ; i++){
            for(int k = i; k < n.length; k++){
                if(n[k] < n[i]) {
                    int a = n[k];
                    n[k] = n[i];
                    n[i] = a;
                }
            }
            System.out.println("配列番号"+ i + "値" +n[i]);
        }
        return n;
    }*/

    public static void printData(int[] n){
        //並び替え結果の表示
        System.out.print("[ ");
        for(int g : n) {
            System.out.print(g + " ");
        }
        System.out.println("]");

    }


}


