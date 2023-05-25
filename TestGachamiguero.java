import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGachamiguero {
    @Test
    public void Test1(){
        String result = Gachamiguero.catar(1);
        Assertions.assertEquals("1",result);
    }
    @Test
    public void Test2(){
        String result = Gachamiguero.catar(2);
        Assertions.assertEquals("2",result);
    }
}
