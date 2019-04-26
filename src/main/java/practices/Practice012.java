package practices;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 配列の中身を小さい順に並べ替える関数 sort を作成しなさい
 * <p>
 * 引数：整数の配列
 * 返却：整数の配列
 * <p>
 * 　例）引数：[0, 2, 3, 1, 9, 7, 6, 4, 5, 8]
 * 　　　返却：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

public class Practice012 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    // 並べ替えられた配列を返す
    public static int[] sort(int[] n) {
        //配列をつくる
        ArrayList<Integer> sort = new ArrayList<Integer>();
        for (int i = 0; i < n.length; i++) {
            sort.add(n[i]);
        }
        //int[]型になおす
        //answerのint[]配列の要素数を決める
        int[] answer = new int[sort.size()];
        //2.forをまわす（ArrayListのこうもくがなくなるまで続ける）
        for (int i = 0; i < sort.size(); i++) {
            answer[i] = sort.get(i);
        }
        //ソートする（小さい順）
        Arrays.sort(answer);
        return answer;
    }
}


