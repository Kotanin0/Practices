package practices;
/**
 * 5の倍数と、5の付く数字のときに "buzz" と返却する関数 buzz を作成しなさい
 *
 * 引数：整数
 * 返却："buzz" / "" (あてはまらない場合は空文字)
 *
 */
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Practice017Test {

    @Test
    public void buzzは5の倍数のときにbuzzとかえす() {
        assertThat(Practice017.buzz(10),is("buzz"));
        assertThat(Practice017.buzz(-10),is("buzz"));
    }

    @Test
    public void buzzは5のつく数字のときにbuzzとかえす(){
        assertThat(Practice017.buzz(13),is("buzz"));
        assertThat(Practice017.buzz(-13),is("buzz"));
    }

    @Test
    public void buzzは5の倍数でも5のつく数字でもないときに空文字をかえす(){
        assertThat(Practice017.buzz(0),is(""));
        assertThat(Practice017.buzz(1),is(""));
    }
}