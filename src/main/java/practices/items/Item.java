package practices.items;

public class Item {
    private String itemName;
    private String itemCatchCopy;
    private String makerName;
    private int price;
    private int itemStock;

    Item(String itemName, String itemCatchCopy, String makerName, int price, int itemStock) {
        this.itemName = itemName;
        this.itemCatchCopy = itemCatchCopy;
        this.makerName = makerName;
        this.price = price;
        this.itemStock = itemStock;

    }

    public String getItemName() {

        return this.itemName;
    }

    public String getItemCatchCopy() {

        return this.itemCatchCopy;
    }

    public String getMakerName() {

        return this.makerName;
    }

    public int getPrice() {

        return this.price;
    }

    public int getItemStock() {

        return this.itemStock;
    }
}

