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

    public static void main(String[] arg) {


        Item[] items = {
                new Item("いろはす", "うまい水", "コカ・コーラ", 130, 9),
                new Item("なす", "静岡産", "なんとか農場", 90, 93),
                new Item("ばなな", "フィリピン産", "フィリピン一番農場", 200, 9),
                new Item("ねぎ", "深谷産", "深谷太郎", 90, 9),
                new Item("コーラ", "砂糖水", "コカ・コーラ", 150, 1000)
        };

        for (Item x : items) {
            System.out.println("商品名:" + x.getName());
            System.out.println("商品キャッチコピー:" + x.getcatchPhrase());
            System.out.println("メーカー名:" + x.getMaker());
            System.out.println("価格:" + x.getPrice());
            System.out.println("在庫数:" + x.getZaiko());
        }


    }



    }









