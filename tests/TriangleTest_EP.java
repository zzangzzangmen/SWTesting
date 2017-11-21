import org.junit.*;

import static java.lang.Double.NaN;
import static org.junit.Assert.*;

/**
 * Created by Yunho on 2017-11-20.
 */

// Testing for equivalence partitioning
public class TriangleTest_EP {

    // Test case for equivalence classes
    private Triangle TC1;
    private Triangle TC2;
    private Triangle TC3;
    private Triangle TC4;
    private Triangle TC5;
    private Triangle TC6;

    @Before
    public void setUp() throws Exception {
        TC1 = new Triangle(500,500,500);
        TC2 = new Triangle(300,300,400);
        TC3 = new Triangle(300,400,500);
        TC4 = new Triangle(300,350,400);
        TC5 = new Triangle(300,300,600);
        TC6 = new Triangle(0,300,500);
    }

    @After
    public void tearDown() throws Exception {
        TC1 = null;
        TC2 = null;
        TC3 = null;
        TC4 = null;
        TC5 = null;
        TC6 = null;
    }


    /* setSideLengths */

    @Test
    public void setSideLengths_TC3() throws Exception {
        TC3.setSideLengths(100, 200, 250);
        assertEquals("Should return '100,200,250'", "100,200,250", TC3.getSideLengths());
    }


    /* getSideLengths */

    @Test
    public void getSideLengths_TC3() throws Exception {
        assertEquals("Should return '300,400,500'", "300,400,500", TC3.getSideLengths());
    }


    /* getPerimeter */

    @Test
    public void getPerimeter_TC2() throws Exception {
        assertEquals("Should return '1000'", 1000, TC2.getPerimeter());
    }

    @Test
    public void getPerimeter_TC3() throws Exception {
        assertEquals("Should return '1200'", 1200, TC3.getPerimeter());
    }

    @Test
    public void getPerimeter_TC5() throws Exception {
        assertEquals("Should return '1200'", 1200, TC5.getPerimeter());
    }

    @Test
    public void getPerimeter_TC6() throws Exception {
        assertEquals("Should return '-1'", -1, TC6.getPerimeter());
    }


    /* getArea */

    @Test
    public void getArea_TC2() throws Exception {
        assertEquals("Should return '44721.3'", 44721.3, TC2.getArea(), 0.1);
    }

    @Test
    public void getArea_TC3() throws Exception {
        assertEquals("Should return '60000.0'", 60000.0, TC3.getArea(), 0.1);
    }

    @Test
    public void getArea_TC5() throws Exception {
        assertEquals("Should return '-1.0'", -1.0, TC5.getArea(), 0.1);
    }

    @Test
    public void getArea_TC6() throws Exception {
        assertEquals("Should return 'NaN'", NaN, TC6.getArea(), 0.1);
    }


    /* classify */

    @Test
    public void classify_TC1() throws Exception {
        assertEquals("Should return 'equilateral'", "equilateral", TC1.classify());
    }

    @Test
    public void classify_TC2() throws Exception {
        assertEquals("Should return 'isosceles'", "isosceles", TC2.classify());
    }

    @Test
    public void classify_TC3() throws Exception {
        assertEquals("Should return 'right-angled'", "right-angled", TC3.classify());
    }

    @Test
    public void classify_TC4() throws Exception {
        assertEquals("Should return 'scalene'", "scalene", TC4.classify());
    }

    @Test
    public void classify_TC5() throws Exception {
        assertEquals("Should return 'impossible'", "impossible", TC5.classify());
    }

    @Test
    public void classify_TC6() throws Exception {
        assertEquals("Should return 'unknown'", "unknown", TC6.classify());
    }


    /* isSomething */

    @Test
    public void isIsosceles_TC2() throws Exception {
        assertTrue("Should be true", TC2.isIsosceles());
    }

    @Test
    public void isEquilateral_TC1() throws Exception {
        assertTrue("Should be true", TC1.isEquilateral());
    }

    @Test
    public void isRightAngled_TC3() throws Exception {
        assertTrue("Should be true", TC3.isRightAngled());
    }

    @Test
    public void isScalene_TC4() throws Exception {
        assertTrue("Should be true", TC4.isScalene());
    }

    @Test
    public void isImpossible_TC5() throws Exception {
        assertTrue("Should be true'", TC5.isImpossible());
    }

    @Test
    public void isImpossible_TC6() throws Exception {
        assertFalse("Should be false", TC6.isImpossible());
    }
}