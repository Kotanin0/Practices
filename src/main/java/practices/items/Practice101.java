package practices.items;

/**
 * 商品を管理するクラスItemを作成しなさい
 *
 * Itemは以下情報が格納でき、取り出しができること
 *
 * - 商品名
 * - 商品キャッチコピー
 * - メーカー名
 * - 価格
 * - 在庫数
 *
 * 作成したItemを利用して、商品情報を5つ登録し、それらを全て出力しなさい
 *
 */

public class Practice101 {
    public static void main(String[] args){
        Item[] itemList = {
                new Item("お茶", "会議のお茶！", "伊藤園", 60, 10000),
                new Item("トイレットペーパー", "3倍巻き！！", "大王製紙", 100, 1000),
                new Item("コピー用紙", "安い！", "アスクル", 198, 100000),
                new Item("ファイル", "安いし便利", "プラス", 10, 3000),
                new Item("インクトナー", "リサイクル！", "コクヨ", 1000, 100),
        };

        for (int i = 0; i < itemList.length; i++) {
            System.out.print(itemList[i].getItemName() + "|");
            System.out.print(itemList[i].getItemCatchCopy() + "|");
            System.out.print(itemList[i].getMakerName() + "|");
            System.out.print(itemList[i].getPrice() + "|");
            System.out.println(itemList[i].getItemStock());
        }
    }
}


