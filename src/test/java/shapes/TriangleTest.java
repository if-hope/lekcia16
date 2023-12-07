package shapes;

import org.example.Triangle;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class TriangleTest {

//    @BeforeMethod
//    public void print(){
//        System.out.println("Okkkk");
//    }
//@Parameters({ "firstSide", "secondSide", "thirdSide", "expected"})
    @Test(dataProvider = "perimeter data", dataProviderClass = ShapesDataProvider.class)
    public void findPerimeterTest(int firstSide, int secondSide, int thirdSide, int expected) throws InterruptedException {
        Triangle triangle = new Triangle();
        Thread.sleep(10000);
        int perimeter = triangle.findPerimeter(firstSide, secondSide, thirdSide);
        Assert.assertEquals(perimeter, expected, "wrong perimeter");
    }

    @Test
    public void findAreaTest() throws InterruptedException {
        Triangle triangle = new Triangle();
        Thread.sleep(10000);
        Assert.assertEquals(triangle.findArea(3, 4), 6);
    }




}
