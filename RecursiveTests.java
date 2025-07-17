import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursiveTests {

    @Test
    public void test1_count8() {
        assertEquals(1, Main.count8(8));
    }

    @Test
    public void test2_count8() {
        assertEquals(2, Main.count8(818));
    }

    @Test
    public void test3_count8() {
        assertEquals(4, Main.count8(8818));
    }

    @Test
    public void test4_count8() {
        assertEquals(0, Main.count8(123)); // no 8s
    }

    @Test
    public void test5_count8() {
        assertEquals(5, Main.count8(888)); // 8 + double 8 = 1 + 2
    }



    
}
