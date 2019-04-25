package practices.items;

/**
 * 商品グループを管理するクラス ItemGroup
 * <p>
 * ItemGroupは以下情報が格納でき、取り出しができること
 * <p>
 * - 商品グループ名
 * - 商品リスト（Item）
 */


public class ItemGroup {
    public String itemGroupName;
    public Item[] itemMember;

    ItemGroup(String itemGroupName, Item[] itemMember) {
        this.itemGroupName = itemGroupName;
        this.itemMember = itemMember;
    }

    public void printGroupData() {
        System.out.println("＝＝＝＝＝＝＝＝＝＝");
        System.out.println("商品グループ名：" + this.itemGroupName);

        for(Item item:itemMember){
            item.printData();
        }
    }
}
