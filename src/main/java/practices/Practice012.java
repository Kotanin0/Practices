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
        for(int g : ex) {
            System.out.println(g);
        }

        sort(ex);
    }

    // 並べ替えられた配列を返す
    public static int[] sort(int[] n) {

        //Arrayクラスのソートを使用した場合
/*
        Arrays.sort(n);
        for (int h: n){
            System.out.println(h);
        }
*/


// ライブラリ使わず

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
    }
}
