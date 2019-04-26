package practices.items;

/**
 * 商品グループを管理するクラス ItemGroup
 *
 */


public class ItemGroup {

    private String itemGroupName;
    private Item[] itemGroupList;

    ItemGroup(String itemGroupName, Item[] itemGroupList){
        this.itemGroupName = itemGroupName;
        this.itemGroupList = itemGroupList;
    }

    public String getItemGroupName(){

        return this.itemGroupName;
    }

    public Item[] getItemGroupList(){

        return this.itemGroupList;
    }

    public static void printItemData(){

    }

}
