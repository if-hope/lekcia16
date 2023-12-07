package shapes;

import org.example.Rectangle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {

    @Test
    public void findPerimeterTest() throws InterruptedException {
        Rectangle rectangle = new Rectangle();
        Thread.sleep(10000);
        Assert.assertEquals(rectangle.findPerimeter(4, 5), 18);
    }
}
