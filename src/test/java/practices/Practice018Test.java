package practices;
/**
 * 3の倍数と、3の付く数字のときに "fizz" と返却
 * 5の倍数と、5の付く数字のときに "buzz" と返却
 * どちらにもあてはまるときに "fizzbuzz" と返却
 * する関数 fizzbuzz を作成しなさい
 *
 * 引数：整数
 * 返却："fizz" / "buzz" / "fizzbuzz" / "" (あてはまらない場合は空文字)
 *
 */
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import main.java.practices.Practice018;

public class Practice018Test {

    @Test
    public void fizzbuzzは3の倍数と3のつく数字のときにfizzとかえす() {
        assertThat(Practice018.fizzbuzz(6),is("fizz"));
        assertThat(Practice018.fizzbuzz(-6),is("fizz"));
        assertThat(Practice018.fizzbuzz(13),is("fizz"));
        assertThat(Practice018.fizzbuzz(-13),is("fizz"));
    }
    @Test
    public void fizzbuzzは5の倍数と5のつく数字のときにbuzzをかえす(){
        assertThat(Practice018.fizzbuzz(10),is("buzz"));
        assertThat(Practice018.fizzbuzz(-10),is("buzz"));
        assertThat(Practice018.fizzbuzz(25),is("buzz"));
        assertThat(Practice018.fizzbuzz(-25),is("buzz"));
    }
    @Test
    public void fizzbuzzは3の倍数と3のつく数字_5の倍数と5のつく数字_どちらにもあてはまるときにfizzbuzzとかえす(){
        assertThat(Practice018.fizzbuzz(60),is("fizzbuzz"));//3の倍数、5の倍数
        assertThat(Practice018.fizzbuzz(51),is("fizzbuzz"));//3の倍数、5のつく数
        assertThat(Practice018.fizzbuzz(35),is("fizzbuzz"));//3のつく数、5の倍数
        assertThat(Practice018.fizzbuzz(53),is("fizzbuzz"));//3のつく数、5のつく数
    }
    @Test
    public void fizzbuzzは3の倍数と3のつく数字_5の倍数と5のつく数字_どちらにもあてはまらないときに空文字をかえす(){
        assertThat(Practice018.fizzbuzz(0),is(""));
        assertThat(Practice018.fizzbuzz(1),is(""));
    }
}