package shapes;

import org.testng.annotations.DataProvider;

public class ShapesDataProvider {
    @DataProvider(name = "perimeter data")
    public Object[][] createData() {
        return new Object[][] {
                {3, 4, 5, 12},
                {5, 6, 7, 18},
                {7, 8, 9, 24}
        };
    }
}
