package practices.items;

/**
 * 商品グループを管理するクラス ItemGroup
 */

public class ItemGroup {
    private Item[] item;
    private String itemGroupName;

    public ItemGroup(Item[] item, String itemGroupName) {
        this.item = item;
        this.itemGroupName = itemGroupName;
    }

    public String printItemGroupNameAndItem() {
        String br = System.getProperty("line.separator");
        String returnString;

        returnString = this.itemGroupName + br;

        for (Item x : item) {
            returnString += (x.printInfo()) + br;
        }
        return returnString.trim();
    }
}
