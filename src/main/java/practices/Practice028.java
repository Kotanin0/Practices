package practices;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static practices.Practice027.getList;

/**
 * Practice027で作成した果物リストを用いて、以下の関数をそれぞれ作成しなさい
 * <p>
 * - 一番単価の高い果物を返す関数
 * <p>
 * - 任意の色の果物を返す関数
 * <p>
 * - 在庫数が多い順で果物を返す関数
 * <p>
 * - 在庫がある果物のみを返す関数
 */

public class Practice028 {
    public static void main(String[] args) {
        getHighPrice();
        getSearchColor("赤");
        getSortedstock();
        getStockList();
    }

    //価格が一番高い果物を返す
    public static void getHighPrice() {
        List<Fruits> fruits028 = getList();

        ArrayList<Fruits> sortedPrice =
                fruits028.stream()
                        .sorted(Comparator.comparing(Fruits::getUnitPrice).reversed()) //単価の大きい順にソート
                        .collect(Collectors.toCollection(ArrayList::new));//その順番でリストに格納する
        System.out.println("価格が一番高いのは ");
        System.out.println("日本語名：" + sortedPrice.get(0).getjpName() + " 英語名：" + sortedPrice.get(0).getName() +
                " 色：" + sortedPrice.get(0).getColor() + " 単価：" + sortedPrice.get(0).getUnitPrice() +
                " 在庫数：" + sortedPrice.get(0).getStock());
    }

    //任意の色を返す
    public static void getSearchColor(String searchColor) {
        List<Fruits> fruits028 = getList();

        ArrayList<Fruits> getColor =
                fruits028.stream()  //streamの取得
                        .filter(s ->searchColor.equals(s.getColor())  )//中間操作
                        .collect(Collectors.toCollection(ArrayList::new));//結果をリストに格納

        System.out.println("色が"+searchColor+ "の果物は");

        for (int i = 0; i < getColor.size(); i++) {
            System.out.println("日本語名：" + getColor.get(i).getjpName() + " 英語名：" + getColor.get(i).getName() +
                    " 色：" + getColor.get(i).getColor() + " 単価：" + getColor.get(i).getUnitPrice() +
                    " 在庫数：" + getColor.get(i).getStock());
        }
    }

    //在庫数が多い順に返す
    public static void getSortedstock() {
        List<Fruits> fruits028 = getList();

        ArrayList<Fruits> sortedStock =
                fruits028.stream()
                        .sorted(Comparator.comparing(Fruits::getStock).reversed())//在庫の多い順にソート
                        .collect(Collectors.toCollection(ArrayList::new));//その順番でリストに格納する

        System.out.println("在庫が多い順は ");
        for (int i = 0; i < sortedStock.size(); i++) {
            System.out.println("日本語名：" + sortedStock.get(i).getjpName() + " 英語名：" + sortedStock.get(i).getName() +
                    " 色：" + sortedStock.get(i).getColor() + " 単価：" + sortedStock.get(i).getUnitPrice() +
                    " 在庫数：" + sortedStock.get(i).getStock());
        }
    }

    //在庫数がある果物のみを返す
    public static void getStockList() {
        List<Fruits> fruits028 = getList();

        ArrayList<Fruits> stockList =
        fruits028.stream()
                .filter(s -> s.getStock() > 0)//在庫が0より大きいでフィルター
                .collect(Collectors.toCollection(ArrayList::new));//結果をリストに格納

        System.out.println("在庫がある果物は ");
        for (int i = 0; i <stockList.size(); i++) {
            System.out.println("日本語名：" + stockList.get(i).getjpName() + " 英語名：" + stockList.get(i).getName() +
                    " 色：" + stockList.get(i).getColor() + " 単価：" + stockList.get(i).getUnitPrice() +
                    " 在庫数：" + stockList.get(i).getStock());
        }
    }
}










