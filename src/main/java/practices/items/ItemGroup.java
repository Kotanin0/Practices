package practices.items;

/**
 * 商品グループを管理するクラス ItemGroup
 */

// * - 商品グループ名 // * - 商品リスト（Item）→を格納しているクラスを作成

public class ItemGroup {
    //参照型Item[]
    private Item[] item;
    private String itemGroupName;

    //コンストラクタ
    ItemGroup(Item[] item, String itemGroupName) {
        this.item = item;
        this.itemGroupName = itemGroupName;
    }

    public String PrintInfomation() {
        //改行コード取得
        String br = System.getProperty("line.separator");
        String strReturn;

        strReturn = this.itemGroupName + br;

        for (Item i : item){
            strReturn += (i.printInfomation2()) + br ;
        }
        return strReturn.trim();
    }

}