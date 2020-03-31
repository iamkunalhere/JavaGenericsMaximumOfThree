import org.junit.Assert;
import org.junit.Test;

public class MaximumOfThreeTest {

    MaximumOfThree maximumOfThreeObject;

    // Test for if first integer is max
    @Test
    public void givenInput_whenFirstNumberIsMaximum_shouldReturnMaximum() {
        int firstMaximum = maximumOfThreeObject.maxInteger(3,2,1);
        Assert.assertEquals(3,firstMaximum);
    }
    // Test for if second integer is max
    @Test
    public void givenInput_whenSecondNumberIsMaximum_shouldReturnMaximum() {
        int secondMaximum = maximumOfThreeObject.maxInteger(1,3,2);
        Assert.assertEquals(3,secondMaximum);
    }
    // Test for if third integer is max
    @Test
    public void givenInput_whenThirdNumberIsMaximum_shouldReturnMaximum() {
        int thirdMaximum = maximumOfThreeObject.maxInteger(1,2,3);
        Assert.assertEquals(3,thirdMaximum);
    }

}
