import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CarTest {
    Car testCar = new Car();

    @Test
    public void testSetMaxSpeedMph() {
        assertEquals(100, testCar.setMaxSpeedMph(125));

    }

    @Test
    public void testSetMaxSpeedKph() {
        assertEquals(160.9, testCar.setMaxSpeedKph(100));
    }

    @Test(dataProvider = "CarDataProvider")
    public void testSetMaxTorque(int horsepower, double rpm) {
        //assertEquals(200, testCar.setMaxTorque(100, 5000));
        System.out.println(" Horsepower is equal to " +  horsepower +  "\n" + "Rpm is equal to " + rpm + "\n" + "Torque is equal to " + testCar.setMaxTorque(horsepower, rpm) );
    }


    @DataProvider(name = "CarDataProvider")
    public Object[][] getData(){
        Object[][] data = {{100, 5000},{125, 4000},{150, 3750}};
        return data;
    }
}