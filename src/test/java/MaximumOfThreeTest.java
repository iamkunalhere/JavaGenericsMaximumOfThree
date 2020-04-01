import org.junit.Assert;
import org.junit.Test;

public class MaximumOfThreeTest {

    MaximumOfThree maximumOfThreeObject;

    // Test for if first integer is max
    @Test
    public void givenInput_whenFirstNumberIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree(3,2,1);
        Integer firstMaximum = (Integer) maximumOfThreeObject.findMaximum();
        Assert.assertEquals( (Integer)3,firstMaximum);
    }
    // Test for if second integer is max
    @Test
    public void givenInput_whenSecondNumberIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree(2,3,1);
        Integer secondMaximum = (Integer) maximumOfThreeObject.findMaximum();
        Assert.assertEquals( (Integer)3,secondMaximum);
    }
    // Test for if third integer is max
    @Test
    public void givenInput_whenThirdNumberIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree(1,2,3);
        Integer thirdMaximum = (Integer) maximumOfThreeObject.findMaximum();
        Assert.assertEquals( (Integer)3,thirdMaximum);
    }
    // Test for if first float is max
    @Test
    public void givenInput_whenFirstFloatIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree(3.3f,1.1f,2.2f);
        Float firstMaximum = (Float) maximumOfThreeObject.findMaximum();
        Assert.assertEquals((Float)3.3f,firstMaximum);
    }
    // Test for if second float is max
    @Test
    public void givenInput_whenSecondFloatIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree(1.1f,3.3f,2.2f);
        Float secondMaximum = (Float) maximumOfThreeObject.findMaximum();
        Assert.assertEquals((Float)3.3f,secondMaximum);
    }
    // Test for if third float is max
    @Test
    public void givenInput_whenThirdFloatIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree(2.2f,1.1f,3.3f);
        Float thirdMaximum = (Float) maximumOfThreeObject.findMaximum();
        Assert.assertEquals((Float)3.3f,thirdMaximum);
    }
    // Test for if first string is max
    @Test
    public void givenInput_whenFirstStringIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree("banana","apple","asdf");
        String firstMaximum = (String) maximumOfThreeObject.findMaximum();
        Assert.assertEquals((String)"banana",firstMaximum);
    }
    // Test for if second string is max
    @Test
    public void givenInput_whenSecondStringIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree("apple","banana","asdf");
        String secondMaximum = (String) maximumOfThreeObject.findMaximum();
        Assert.assertEquals((String)"banana",secondMaximum);
    }
    // Test for if third string is max
    @Test
    public void givenInput_whenThirdStringIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree("asdf","apple","banana");
        String thirdMaximum = (String) maximumOfThreeObject.findMaximum();
        Assert.assertEquals((String)"banana",thirdMaximum);
    }
}