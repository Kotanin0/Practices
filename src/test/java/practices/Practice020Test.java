package practices;
/**
 * 入力された文字列が郵便番号、電話番号、メールアドレス、それ以外のいずれかを判定する関数
 * isPostNumber
 * isPhoneNumber
 * isMailAddress
 * をそれぞれ作成しなさい
 *
 * isPostNumber
 * 入力：文字列
 * 出力：true/false
 * 判定条件：7桁の連続した数値の文字列, 3桁-4桁の数値とハイフンで構成された文字列
 * 例：1234567=true, 123-4567=true, ...
 *
 * isPhoneNumber
 * 入力：文字列
 * 出力：true/false
 * 判定条件：11桁の連続した数値の文字列, 数値とハイフン2つで構成された文字列
 * 例：09012345678=true, 090-1234-5678=true, 03-1234-5678=true, ...
 *
 * isMailAddress
 * 入力：文字列
 * 出力：true/false
 * 判定条件：@を必ず含む, 末尾が ".com", ".co.jp", ".ne.jp" で終わる
 * 例：hoge@fuga.com=true, anonymous123@hoge.co.jp=true, ...
 *
 */
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Practice020Test {
    //Test isPostNumber
    @Test//正しい郵便番号 = 7桁の連続した数値の文字列, 3桁-4桁の数値とハイフンで構成された文字列
    public void isPostNumberは正しい郵便番号だとtrueをかえす() {
        assertThat(Practice020.isPostNumber("1234567"),is(true));
        assertThat(Practice020.isPostNumber("123-4567"),is(true));
    }
    @Test
    public void isPostNumberは正しくない郵便番号だとfalseをかえす_桁数過不足() {
        assertThat(Practice020.isPostNumber("12345678"),is(false));
        assertThat(Practice020.isPostNumber("123456"),is(false));
    }
    @Test
    public void isPostNumberは正しくない郵便番号だとfalseをかえす_ハイフンの位置ズレ() {
        assertThat(Practice020.isPostNumber("1-234567"),is(false));
        assertThat(Practice020.isPostNumber("1234-567"),is(false));
    }
    @Test
    public void isPostNumberは正しくない郵便番号だとfalseをかえす_数字ではない() {
        assertThat(Practice020.isPostNumber("123-ABCD"),is(false));
        assertThat(Practice020.isPostNumber("ABCDEFG"),is(false));
    }
    //Test isPhoneNumber
    @Test//正しい電話番号 = 11桁の連続した数値の文字列, 数値とハイフン2つで構成された文字列
    public void isPhoneNumberは正しい電話番号だとtrueをかえす() {
        assertThat(Practice020.isPhoneNumber("09012345678"),is(true));
        assertThat(Practice020.isPhoneNumber("090-1234-5678"),is(true));
    }
    @Test
    public void isPhoneNumberは正しくない電話番号だとfalseをかえす_桁数過不足() {
        assertThat(Practice020.isPhoneNumber("0901234567"),is(false));
        assertThat(Practice020.isPhoneNumber("090-1234-56789"),is(false));
    }
    @Test
    public void isPhoneNumberは正しくない電話番号だとfalseをかえす_ハイフンの位置ずれ() {
        assertThat(Practice020.isPhoneNumber("-09012345678"),is(false));
        assertThat(Practice020.isPhoneNumber("09012345679-"),is(false));
    }
    @Test
    public void isPhoneNumberは正しくない電話番号だとfalseをかえす_数字ではない() {
        assertThat(Practice020.isPhoneNumber("123456789AB"),is(false));
        assertThat(Practice020.isPhoneNumber("ABC-DEFG-HIJK"),is(false));
    }

    @Test//@を必ず含む, 末尾が ".com", ".co.jp", ".ne.jp" で終わる
    public void isMailAddressは正しいメールアドレスだとtrueをかえす() {
        assertThat(Practice020.isMailAddress("test@test.com"),is(true));
        assertThat(Practice020.isMailAddress("test@test.co.jp"),is(true));
        assertThat(Practice020.isMailAddress("test@test.ne.jp"),is(true));
    }
    @Test
    public void isMailAddressは正しくないメールアドレスだとfalseをかえす_ローカルパートがない() {
        assertThat(Practice020.isMailAddress("@test.com"),is(false));
    }
    @Test
    public void isMailAddressは正しくないメールアドレスだとfalseをかえす_アットマークがない() {
        assertThat(Practice020.isMailAddress("test.com"),is(false));
    }
    @Test
    public void isMailAddressは正しくないメールアドレスだとfalseをかえす_ドメインが不正() {
        assertThat(Practice020.isMailAddress("test@testne.jp"),is(false));
        assertThat(Practice020.isMailAddress("test@test.jp"),is(false));
        assertThat(Practice020.isMailAddress("test@test.uk"),is(false));
    }
}