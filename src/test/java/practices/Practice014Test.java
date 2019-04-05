package practices;
/**
 * 西暦を入力するとうるう年か判定する関数 isLeapYear を作成しなさい
 *
 * 引数：整数
 * 返却：true/false
 *
 */
import org.junit.Test;
import main.java.practices.Practice014;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Practice014Test {

    //条件網羅テスト
    @Test //4の倍数ではない
    public void isLeapYearはうるう年ではないとfalseをかえす_2003年の場合(){
        assertThat(Practice014.isLeapYear(2003),is(false));
    }

    @Test //4の倍数、100の倍数、400の倍数ではない
    public void isLeapYearはうるう年ではないとfalseをかえす_1900年の場合(){
        assertThat(Practice014.isLeapYear(1900),is(false));
    }

    @Test//4の倍数、100の倍数、400の倍数
    public void isLeapYearはうるう年だとTrueをかえす_2000年の場合(){
        assertThat(Practice014.isLeapYear(2000),is(true));
    }

    @Test//4の倍数、100の倍数ではない
    public void isLeapYearはうるう年だとTrueをかえす_2004年の場合(){
        assertThat(Practice014.isLeapYear(2004),is(true));
    }

}