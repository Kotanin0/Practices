package practices;
/**
 * 3の倍数と、3の付く数字のときに "fizz" と返却する関数 fizz を作成しなさい
 *
 * 引数：整数
 * 返却："fizz" / "" (あてはまらない場合は空文字)
 *
 */
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Practice016Test {

    @Test
    public void fizzは3の倍数のときにfizzとかえす() {
        assertThat(Practice016.fizz(6),is("fizz"));
        assertThat(Practice016.fizz(-6),is("fizz"));
    }

    @Test
    public void fizzは３のつく数字のときにfizzとかえす(){
        assertThat(Practice016.fizz(13),is("fizz"));
        assertThat(Practice016.fizz(-13),is("fizz"));
    }

    @Test
    public void fizzは3の倍数でも３のつく数字でもないときに空文字をかえす(){
        assertThat(Practice016.fizz(0),is(""));
        assertThat(Practice016.fizz(1),is(""));
    }
}