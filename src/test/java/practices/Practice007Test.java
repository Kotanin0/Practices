package practices;

/**
 * 素数を判定する関数 isPrime を作成しなさい
 *
 * 引数：任意の数値
 * 返却：true/false
 */

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class Practice007Test {
//
//    @Test
//    public void isPrime() {
//        //素数ではない(expected = false)
//        assertEquals("1は素数ではない",false, Practice007.isPrime(1));
//        assertEquals("4は素数ではない",false, Practice007.isPrime(4));
//        //素数(expected = true)
//        assertEquals("3は素数",true, Practice007.isPrime(3));
//        assertEquals("3571は素数",true, Practice007.isPrime(3571));
//    }
//
//    //割り切れない場合の例外処理
//    @Test(expected = IllegalArgumentException.class)
//    public void testIllegalArgumentException() {
//        Practice007.isPrime(0);
//        Practice007.isPrime(-1);
//    }
//
//}