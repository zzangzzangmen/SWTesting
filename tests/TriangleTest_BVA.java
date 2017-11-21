import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Double.NaN;
import static org.junit.Assert.*;

/**
 * Created by Yunho on 2017-11-22.
 */

// Testing for boundary value analysis
public class TriangleTest_BVA {

    // Test case for boundary value analysis
    private Triangle TC1;
    private Triangle TC2;
    private Triangle TC3;
    private Triangle TC4;
    private Triangle TC5;
    private Triangle TC6;
    private Triangle TC7;
    private Triangle TC8;
    private Triangle TC9;
    private Triangle TC10;
    private Triangle TC11;
    private Triangle TC12;
    private Triangle TC13;
    private Triangle TC14;
    private Triangle TC15;
    private Triangle TC16;
    private Triangle TC17;
    private Triangle TC18;


    @Before
    public void setUp() throws Exception {
        TC1 = new Triangle(500,500,500);
        TC2 = new Triangle(499,500,500);
        TC3 = new Triangle(501,500,500);
        TC4 = new Triangle(300,300,400);
        TC5 = new Triangle(300,299,400);
        TC6 = new Triangle(300,301,400);
        TC7 = new Triangle(300,400,500);
        TC8 = new Triangle(300,400,499);
        TC9 = new Triangle(300,400,501);
        TC10 = new Triangle(300,350,400);
        TC11 = new Triangle(299,350,400);
        TC12 = new Triangle(301,350,400);
        TC13 = new Triangle(300,300,600);
        TC14 = new Triangle(300,299,600);
        TC15 = new Triangle(300,301,600);
        TC16 = new Triangle(0,300,500);
        TC17 = new Triangle(-1,300,500);
        TC18 = new Triangle(1,300,500);
    }

    @After
    public void tearDown() throws Exception {
        TC1 = null;
        TC2 = null;
        TC3 = null;
        TC4 = null;
        TC5 = null;
        TC6 = null;
        TC7 = null;
        TC8 = null;
        TC9 = null;
        TC10 = null;
        TC11 = null;
        TC12 = null;
        TC13 = null;
        TC14 = null;
        TC15 = null;
        TC16 = null;
        TC17 = null;
        TC18 = null;
    }


    /* setSideLengths */

    @Test
    public void setSideLengths_TC7() throws Exception {
        TC7.setSideLengths(100, 200, 250);
        assertEquals("Should return '100,200,250'", "100,200,250", TC7.getSideLengths());
    }


    /* getSideLengths */

    @Test
    public void getSideLengths_TC7() throws Exception {
        assertEquals("Should return '300,400,500'", "300,400,500", TC7.getSideLengths());
    }


    /* getPerimeter */

    @Test
    public void getPerimeter_TC4() throws Exception {
        assertEquals("Should return '1000'", 1000, TC4.getPerimeter());
    }

    @Test
    public void getPerimeter_TC7() throws Exception {
        assertEquals("Should return '1200'", 1200, TC7.getPerimeter());
    }

    @Test
    public void getPerimeter_TC13() throws Exception {
        assertEquals("Should return '1200'", 1200, TC13.getPerimeter());
    }

    @Test
    public void getPerimeter_TC15() throws Exception {
        assertEquals("Should return '1201'", 1201, TC15.getPerimeter());
    }

    @Test
    public void getPerimeter_TC16() throws Exception {
        assertEquals("Should return '-1'", -1, TC16.getPerimeter());
    }

    @Test
    public void getPerimeter_TC18() throws Exception {
        assertEquals("Should return '-1'", -1, TC18.getPerimeter());
    }


    /* getArea */

    @Test
    public void getArea_TC4() throws Exception {
        assertEquals("Should return '44721.3'", 44721.3, TC4.getArea(), 0.1);
    }

    @Test
    public void getArea_TC7() throws Exception {
        assertEquals("Should return '60000.0'", 60000.0, TC7.getArea(), 0.1);
    }

    @Test
    public void getArea_TC13() throws Exception {
        assertEquals("Should return '-1.0'", -1.0, TC13.getArea(), 0.1);
    }

    @Test
    public void getArea_TC15() throws Exception {
        assertEquals("Should return '5198.3'", 5198.3, TC15.getArea(), 0.1);
    }

    @Test
    public void getArea_TC16() throws Exception {
        assertEquals("Should return 'NaN'", NaN, TC16.getArea(), 0.1);
    }

    @Test
    public void getArea_TC18() throws Exception {
        assertEquals("Should return '-1.0'", -1.0, TC18.getArea(), 0.1);
    }


    /* classify */

    @Test
    public void classify_TC1() throws Exception {
        assertEquals("Should return 'equilateral'", "equilateral", TC1.classify());
    }

    @Test
    public void classify_TC2() throws Exception {
        assertEquals("Should return 'scalene'", "scalene", TC2.classify());
    }

    @Test
    public void classify_TC3() throws Exception {
        assertEquals("Should return 'scalene'", "scalene", TC3.classify());
    }

    @Test
    public void classify_TC4() throws Exception {
        assertEquals("Should return 'isosceles'", "isosceles", TC4.classify());
    }

    @Test
    public void classify_TC5() throws Exception {
        assertEquals("Should return 'scalene'", "scalene", TC5.classify());
    }

    @Test
    public void classify_TC6() throws Exception {
        assertEquals("Should return 'scalene'", "scalene", TC6.classify());
    }

    @Test
    public void classify_TC7() throws Exception {
        assertEquals("Should return 'right-angled'", "right-angled", TC7.classify());
    }

    @Test
    public void classify_TC8() throws Exception {
        assertEquals("Should return 'scalene'", "scalene", TC8.classify());
    }

    @Test
    public void classify_TC9() throws Exception {
        assertEquals("Should return 'scalene'", "scalene", TC9.classify());
    }

    @Test
    public void classify_TC10() throws Exception {
        assertEquals("Should return 'scalene'", "scalene", TC10.classify());
    }

    @Test
    public void classify_TC11() throws Exception {
        assertEquals("Should return 'scalene'", "scalene", TC11.classify());
    }

    @Test
    public void classify_TC12() throws Exception {
        assertEquals("Should return 'scalene'", "scalene", TC12.classify());
    }

    @Test
    public void classify_TC13() throws Exception {
        assertEquals("Should return 'impossible'", "impossible", TC13.classify());
    }

    @Test
    public void classify_TC14() throws Exception {
        assertEquals("Should return 'impossible'", "impossible", TC14.classify());
    }

    @Test
    public void classify_TC15() throws Exception {
        assertEquals("Should return 'scalene'", "scalene", TC15.classify());
    }

    @Test
    public void classify_TC16() throws Exception {
        assertEquals("Should return 'unknown'", "unknown", TC16.classify());
    }

    @Test
    public void classify_TC17() throws Exception {
        assertEquals("Should return 'unknown'", "unknown", TC17.classify());
    }

    @Test
    public void classify_TC18() throws Exception {
        assertEquals("Should return 'impossible'", "impossible", TC18.classify());
    }


    /* isIsosceles */

    @Test
    public void isIsosceles_TC4() throws Exception {
        assertTrue("Should be true", TC4.isIsosceles());
    }

    @Test
    public void isIsosceles_TC5() throws Exception {
        assertFalse("Should be false", TC5.isIsosceles());
    }

    @Test
    public void isIsosceles_TC6() throws Exception {
        assertFalse("Should be false", TC6.isIsosceles());
    }


    /* isEquilateral */

    @Test
    public void isEquilateral_TC1() throws Exception {
        assertTrue("Should be true", TC1.isEquilateral());
    }

    @Test
    public void isEquilateral_TC2() throws Exception {
        assertFalse("Should be false", TC2.isEquilateral());
    }

    @Test
    public void isEquilateral_TC3() throws Exception {
        assertFalse("Should be false", TC3.isEquilateral());
    }


    /* isRightAngled */

    @Test
    public void isRightAngled_TC7() throws Exception {
        assertTrue("Should be true", TC7.isRightAngled());
    }

    @Test
    public void isRightAngled_TC8() throws Exception {
        assertFalse("Should be false", TC8.isRightAngled());
    }

    @Test
    public void isRightAngled_TC9() throws Exception {
        assertFalse("Should be false", TC9.isRightAngled());
    }


    /* isScalene */

    @Test
    public void isScalene_TC10() throws Exception {
        assertTrue("Should be true", TC10.isScalene());
    }

    @Test
    public void isScalene_TC11() throws Exception {
        assertTrue("Should be true", TC11.isScalene());
    }

    @Test
    public void isScalene_TC12() throws Exception {
        assertTrue("Should be true", TC12.isScalene());
    }


    /* isImpossible */

    @Test
    public void isImpossible_TC13() throws Exception {
        assertTrue("Should be true'", TC13.isImpossible());
    }

    @Test
    public void isImpossible_TC14() throws Exception {
        assertTrue("Should be true'", TC14.isImpossible());
    }

    @Test
    public void isImpossible_TC15() throws Exception {
        assertFalse("Should be false", TC15.isImpossible());
    }

    @Test
    public void isImpossible_TC16() throws Exception {
        assertFalse("Should be false", TC16.isImpossible());
    }

    @Test
    public void isImpossible_TC17() throws Exception {
        assertFalse("Should be false", TC17.isImpossible());
    }

    @Test
    public void isImpossible_TC18() throws Exception {
        assertTrue("Should be true'", TC18.isImpossible());
    }
}