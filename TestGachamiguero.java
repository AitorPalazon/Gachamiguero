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
    @Test
    public void Test3(){
        String result = Gachamiguero.catar(3);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void Test4(){
        String result = Gachamiguero.catar(4);
        Assertions.assertEquals("4",result);
    }
    @Test
    public void Test5(){
        String result = Gachamiguero.catar(5);
        Assertions.assertEquals("Miga",result);
    }
    @Test
    public void Test6(){
        String result = Gachamiguero.catar(6);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void Test7(){
        String result = Gachamiguero.catar(7);
        Assertions.assertEquals("7",result);
    }
    @Test
    public void Test8(){
        String result = Gachamiguero.catar(8);
        Assertions.assertEquals("8",result);
    }
    @Test
    public void Test9(){
        String result = Gachamiguero.catar(9);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void Test10(){
        String result = Gachamiguero.catar(10);
        Assertions.assertEquals("Miga",result);
    }
    @Test
    public void Test11(){
        String result = Gachamiguero.catar(11);
        Assertions.assertEquals("11",result);
    }
    @Test
    public void Test12(){
        String result = Gachamiguero.catar(12);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void Test13(){
        String result = Gachamiguero.catar(13);
        Assertions.assertEquals("13",result);
    }
    @Test
    public void Test14(){
        String result = Gachamiguero.catar(14);
        Assertions.assertEquals("14",result);
    }
    @Test
    public void Test15(){
        String result = Gachamiguero.catar(15);
        Assertions.assertEquals("Gachamiga",result);
    }
    @Test
    public void Test30(){
        String result = Gachamiguero.catar(30);
        Assertions.assertEquals("Gachamiga",result);
    }
}
