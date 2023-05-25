import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestV2 {
    @Test
    public void Test1(){
        String result = V2.cocinar(1);
        Assertions.assertEquals("1",result);
    }
    @Test
    public void Test2(){
        String result = V2.cocinar(2);
        Assertions.assertEquals("2",result);
    }
    @Test
    public void Test3(){
        String result = V2.cocinar(3);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void Test4(){
        String result = V2.cocinar(4);
        Assertions.assertEquals("4",result);
    }
}
