import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGachamiguero {
    @Test
    public void Test1(){
        String result = Gachamiguero.catar(1);
        Assertions.assertEquals("1",result);
    }
}
