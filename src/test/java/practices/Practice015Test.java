package practices;
/**
 * 入力された文字の中に "ge" という文字列が含まれているか判定する関数 ge を作成しなさい
 *
 * 引数：文字列
 * 返却：true/false
 *
 */
import org.junit.Test;
import main.java.practices.Practice015;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Practice015Test {
    @Test
    public void 関数geは入力された文字の中にgeとう文字列が含まれていたらTrueをかえす(){
        assertThat(Practice015.ge("yamagata"),is(true));
    }

    @Test
    public void 関数geは入力された文字の中にgeとう文字列が含まれていなかったらfalseをかえす(){
        assertThat(Practice015.ge("miyazaki"),is(false));
    }

}