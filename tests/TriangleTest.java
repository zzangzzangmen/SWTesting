import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Yunho on 2017-11-20.
 */
public class TriangleTest {
    private Triangle eqiliteralTriangle;
    private Triangle aboveEqiliteralTriangle;
    private Triangle belowEqiliteralTriangle;
    private Triangle isoscelesTriangle;
    private Triangle aboveIsoscelesTriangle;
    private Triangle belowIsoscelesTriangle;
    private Triangle scaleneTriangle;
    private Triangle notScaleneTriangle;
    private Triangle rightAngledTriangle;
    private Triangle aboveRightAngledTriangle;
    private Triangle belowRightAngledTriangle;
    private Triangle impossibleLBTriangle;
    private Triangle notImpossibleALBTriangle;
    private Triangle impossibleUBTriangle;
    private Triangle notImpossibleBUBTriangle;

    @Before
    public void setUp() throws Exception {
//        eqiliteralTriangle = new Triangle(200,200,200);
//        aboveEqiliteralTriangle = new Triangle(201,200,200);
//        belowEqiliteralTriangle = new Triangle(199,200,200);
//        isoscelesTriangle = new Triangle(300,300,200);
//        aboveIsoscelesTriangle = new Triangle(300,200,201);
//        belowIsoscelesTriangle = new Triangle(300,200,199);
//        scaleneTriangle = new Triangle(199,200,201);
//        notScaleneTriangle = new Triangle(200,200,201);
        rightAngledTriangle = new Triangle(300,400,500);
//        aboveRightAngledTriangle = new Triangle(300,400,499);
//        belowRightAngledTriangle = new Triangle(300,400,501);
//        impossibleLBTriangle = new Triangle(0,200,200);
//        notImpossibleALBTriangle = new Triangle(1,200,200);
//        impossibleUBTriangle = new Triangle(300,400,700);
//        notImpossibleBUBTriangle = new Triangle(300,400,699);

        System.out.println("before!!");
    }

    @After
    public void tearDown() throws Exception {
        rightAngledTriangle = null;
        System.out.println("After!!");
    }

    @Test
    @Ignore
    public void setSideLengths() throws Exception {
    }

    @Test
    public void getSideLengths() throws Exception {
        assertEquals("Should return '300,400,500'", "300,400,500", rightAngledTriangle.getSideLengths());
    }

    @Test
    @Ignore
    public void getPerimeter() throws Exception {
    }

    @Test
    @Ignore
    public void getArea() throws Exception {
    }

    @Test
    @Ignore
    public void classify() throws Exception {
    }

    @Test
    @Ignore
    public void isIsosceles() throws Exception {
    }

    @Test
    @Ignore
    public void isEquilateral() throws Exception {
    }

    @Test
    @Ignore
    public void isRightAngled() throws Exception {
    }

    @Test
    @Ignore
    public void isScalene() throws Exception {
    }

    @Test
    @Ignore
    public void isImpossible() throws Exception {
    }

}