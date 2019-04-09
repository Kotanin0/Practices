package practices.items;

/**
 * 商品グループを管理するクラスItemGroupを作成しなさい
 * <p>
 * ItemGroupは以下情報が格納でき、取り出しができること
 * <p>
 * - 商品グループ名
 * - 商品リスト（Item）
 * <p>
 * 作成したItemGroupを利用して、商品グループを2つ登録し、それらを全て出力しなさい
 */

public class Practice102 {
    public static void main(String[] args) {
        //商品グループ：サンダーバード
        Item[] itemArray1 = {
                new Item("サンダーバード１号", "超音速有人ロケット機", "国際救助隊", 100, 1),
                new Item("サンダーバード２号", "大型輸送機", "国際救助隊", 200, 1),
                new Item("サンダーバード３号", "再使用型宇宙往還機", "国際救助隊", 300, 1),
                new Item("サンダーバード４号", "潜航艇", "国際救助隊", 400, 1),
                new Item("サンダーバード５号", "有人宇宙ステーション", "国際救助隊", 500, 1),
        };
        ItemGroup thunderbird = new ItemGroup(itemArray1, "サンダーバード");

        //商品グループ：ヱヴァンゲリヲン
        Item[] itemArray2 = {
                new Item("零号機", "綾波レイ", "NERV", 100, 1),
                new Item("初号機", "碇シンジ", "NERV", 200, 1),
                new Item("弐号機", "アスカ・ラングレー", "NERV", 300, 1),
        };
        ItemGroup evangelion = new ItemGroup(itemArray2, "ヱヴァンゲリヲン");

        //出力
        System.out.println(thunderbird.printItemGroupNameAndItem());
        System.out.println(evangelion.printItemGroupNameAndItem());
    }
}
