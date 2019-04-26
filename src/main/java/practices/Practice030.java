package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Practice019 で作成した coincheck を拡張しなさい
 * <p>
 * 仕様追加）
 * ・元号が変わったので、新しい硬貨ができました！
 * 　250円玉、25円玉
 * ・硬貨の枚数が0枚の時は、出力しなくて良い
 * ・500円玉が切れている場合があるらしいので、500円玉でかえす or かえさないを引数に追加してください
 * <p>
 * 提出方法）
 * ・Practice019のcoincheckを、本クラスにコピーして、まずプルリクエストを出してください
 * ・その後、解いてください
 */

public class Practice030 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        System.out.println(coincheck(3927, 1));
    }

    public static String coincheck(int n, int m) {

        ArrayList<Integer> coinList = new ArrayList<>();
        ArrayList<Integer> coinListAll = new ArrayList<>(Arrays.asList(100, 250, 500, 50, 25, 10, 5, 1));
        ArrayList<Integer> coinListExcept500 = new ArrayList<>(Arrays.asList(25, 100, 50, 250, 10, 5, 1));

        //500円玉が切れているかどうかの場合分け
        switch (m) {
            case 0://全部のコインがある
                coinList = new ArrayList<>(coinListAll);
                break;
            case 1://500円玉が切れている
                coinList = new ArrayList<>(coinListExcept500);
                break;
        }
        int amount = n;
        {
            //コインリストの格納順がバラバラになっている場合を考慮
            ArrayList<Integer> coinListSorted =
                    coinList.stream()
                            .sorted(Comparator.reverseOrder()) //金額の大きいコイン順にソート
                            .collect(Collectors.toCollection(ArrayList::new));//その順番でリストに格納する

            ArrayList<Integer> coinResult = new ArrayList<>();   //使ったコイン格納用
            ArrayList<Integer> countResult = new ArrayList<>();  //使ったコインの枚数格納用

            for (int i = 0; i < coinListSorted.size(); i++) {
                if (amount / coinListSorted.get(i) != 0) coinResult.add(coinListSorted.get(i));
                if (amount / coinListSorted.get(i) != 0) countResult.add(amount / coinListSorted.get(i));
                amount = amount % coinListSorted.get(i);
            }
            for (int i = 0; i < coinResult.size(); i++) {
                System.out.println(coinResult.get(i) + "円 " + countResult.get(i) + "枚");
            }
            return "";
        }
    }

}
