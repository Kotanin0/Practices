package practices;

import java.util.ArrayList;

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
        int[] a = {1, 2, 3, 4, 5};
        getOdd(a);
    }

    // 奇数のみを返す
    public static int[] getOdd(int[] n) {

        ArrayList<Integer> getOdd = new ArrayList<Integer>();
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                getOdd.add(n[i]);
            }
        }
        //ほしいもの→int配列の奇数
        //いま、ArrayList<Integer>の奇数はある
        //1.入れる箱をつくる
        int[] answer = new int[getOdd.size()];
        //2.forをまわす（ArrayListのこうもくがなくなるまで続ける）
        for (int i = 0; i < getOdd.size(); i++) {
            answer[i] = getOdd.get(i);
        }
        //ArrayListの0番目を、int配列の0番目にいれる
        //ArrayListの・・・・
        //returnでint配列を返す
        return answer;
    }

    // 偶数のみを返す
    public static int[] getEven(int[] n) {
        ArrayList<Integer> getEven = new ArrayList<Integer>();
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                getEven.add(n[i]);
            }
        }
        //1.入れる箱をつくる(
        //sizeはリストの要素を知るときに使う命令,
        //（配列-length)、りすS（List-size）
        int[] answergusu = new int[getEven.size()];
        //2.forをまわす（ArrayListのこうもくがなくなるまで続ける）
        for (int i = 0; i < getEven.size(); i++) {
            answergusu[i] = getEven.get(i);
        }
        return answergusu;
    }

}