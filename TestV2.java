import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestV2 {
    @Test
    public void Test1(){
        String result = V2.cocinar(1);
        Assertions.assertEquals("1",result);
    }
}
