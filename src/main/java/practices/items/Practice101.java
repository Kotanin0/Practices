package practices.items;

/**
 * 商品を管理するクラスItemを作成しなさい
 * <p>
 * Itemは以下情報が格納でき、取り出しができること
 * <p>
 * - 商品名
 * - 商品キャッチコピー
 * - メーカー名
 * - 価格
 * - 在庫数
 * <p>
 * 作成したItemを利用して、商品情報を5つ登録し、それらを全て出力しなさい
 */

public class Practice101 {
    public static void main(String[] args) {
        Item[] item = {
                new Item("サンダーバード１号", "超音速有人ロケット機", "国際救助隊", 100, 1),
                new Item("サンダーバード２号", "大型輸送機", "国際救助隊", 200, 1),
                new Item("サンダーバード３号", "再使用型宇宙往還機", "国際救助隊", 300, 1),
                new Item("サンダーバード４号", "潜航艇", "国際救助隊", 400, 1),
                new Item("サンダーバード５号", "有人宇宙ステーション", "国際救助隊", 500, 1),
        };

        for (Item x : item) {
            System.out.println(x.printInfo());
        }
    }
}
