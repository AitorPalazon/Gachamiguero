import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestV3 {
    @Test
    public void Test1(){
        String result = V3.catar(1);
        Assertions.assertEquals("1",result);
    }
}
