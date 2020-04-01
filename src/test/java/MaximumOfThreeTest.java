import org.junit.Assert;
import org.junit.Test;

public class MaximumOfThreeTest {

    MaximumOfThree maximumOfThreeObject;

    // Test for if first integer is max
    @Test
    public void givenInput_whenFirstNumberIsMaximum_shouldReturnMaximum() {
        Integer firstMaximum = (Integer) maximumOfThreeObject.findMaximum(3,2,1);
        Assert.assertEquals( Integer.valueOf(3),firstMaximum);
    }
    // Test for if second integer is max
    @Test
    public void givenInput_whenSecondNumberIsMaximum_shouldReturnMaximum() {
        Integer secondMaximum = maximumOfThreeObject.findMaximum(1,3,2);
        Assert.assertEquals(Integer.valueOf(3),secondMaximum);
    }
    // Test for if third integer is max
    @Test
    public void givenInput_whenThirdNumberIsMaximum_shouldReturnMaximum() {
        Integer thirdMaximum = maximumOfThreeObject.findMaximum(1,2,3);
        Assert.assertEquals(Integer.valueOf(3),thirdMaximum);
    }
    // Test for if first float is max
    @Test
    public void givenInput_whenFirstFloatIsMaximum_shouldReturnMaximum() {
        Float firstMaximum = maximumOfThreeObject.findMaximum(3.3f,2.2f,1.1f);
        Assert.assertEquals(Float.valueOf(3.3f),firstMaximum);
    }
    // Test for if second float is max
    @Test
    public void givenInput_whenSecondFloatIsMaximum_shouldReturnMaximum() {
        Float secondMaximum = maximumOfThreeObject.findMaximum(1.1f,3.3f,2.2f);
        Assert.assertEquals(Float.valueOf(3.3f),secondMaximum);
    }
    // Test for if third float is max
    @Test
    public void givenInput_whenThirdFloatIsMaximum_shouldReturnMaximum() {
        Float thirdMaximum = maximumOfThreeObject.findMaximum(1.1f,2.2f,3.3f);
        Assert.assertEquals(Float.valueOf(3.3f),thirdMaximum);
    }
    // Test for if first string is max
    @Test
    public void givenInput_whenFirstStringIsMaximum_shouldReturnMaximum() {
        String firstMaximum = maximumOfThreeObject.findMaximum("banana","apple","asdf");
        Assert.assertEquals("banana",firstMaximum);
    }
    // Test for if second string is max
    @Test
    public void givenInput_whenSecondStringIsMaximum_shouldReturnMaximum() {
        String secondMaximum = maximumOfThreeObject.findMaximum("apple","banana","asdf");
        Assert.assertEquals("banana",secondMaximum);
    }
    // Test for if third string is max
    @Test
    public void givenInput_whenThirdStringIsMaximum_shouldReturnMaximum() {
        String thirdMaximum = maximumOfThreeObject.findMaximum("apple","asdf","banana");
        Assert.assertEquals("banana",thirdMaximum);
    }
}