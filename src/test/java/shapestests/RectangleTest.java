package shapestests;

import org.example.Rectangle;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.EnvironmentProperties;


public class RectangleTest {

    @Test
    public void findPerimeterTest() throws InterruptedException {
        System.out.println("Ok");
        System.out.println(EnvironmentProperties.getUrl());
        Rectangle rectangle = new Rectangle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(rectangle.findPerimeter(4, 5), 10, "first assert");
        System.out.println("test ok");
        softAssert.assertEquals(rectangle.findPerimeter(4, 5), 18, "second assert");
        System.out.println("Hello!");
        softAssert.assertAll();
    }
}
