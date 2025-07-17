import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursiveTests {
    // Problem 1
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
    // Problem 2
    @Test
    public void testCountHi1() {
        assertEquals(1, Main.countHi("xxhixx"));
    }

    @Test
    public void testCountHi2() {
        assertEquals(2, Main.countHi("xhixhix"));
    }

    @Test
    public void testCountHi3() {
        assertEquals(1, Main.countHi("hi"));
    }

    @Test
    public void testCountHi4() {
        assertEquals(2, Main.countHi("hihi")); // hi at 0, hi at 2
    }

    @Test
    public void testCountHi5() {
        assertEquals(0, Main.countHi("hello")); // no "hi"
    }
    
    // Problem 3
    @Test
    public void testCountHiPart2_1() {
        assertEquals(1, Main.countHi2("ahixhi"));
    }

    @Test
    public void testCountHiPart2_2() {
        assertEquals(2, Main.countHi2("ahibhi"));
    }

    @Test
    public void testCountHiPart2_3() {
        assertEquals(0, Main.countHi2("xhixhi"));
    }

    @Test
    public void testCountHiPart2_4() {
        assertEquals(3, Main.countHi2("ahishihibxhi"));
    }

    @Test
    public void testCountHiPart2_5() {
        assertEquals(1, Main.countHi2("xhibhixhi"));
    }

    // Problem 4
    @Test
    public void testStrCount_1() {
        assertEquals(2, Main.countSub("catcowcat", "cat"));
    }

    @Test
    public void testStrCount_2() {
        assertEquals(1, Main.countSub("catcowcat", "cow"));
    }

    @Test
    public void testStrCount_3() {
        assertEquals(0, Main.countSub("catcowcat", "dog"));
    }

    @Test
    public void testStrCount_4() {
        assertEquals(3, Main.countSub("dogdogdog", "dog"));
    }

    @Test
    public void testStrCount_5() {
        assertEquals(1, Main.countSub("abcabcdefg", "abcabc"));
    }
    



    
}
