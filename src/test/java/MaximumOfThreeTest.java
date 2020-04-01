import org.junit.Assert;
import org.junit.Test;

public class MaximumOfThreeTest {

    MaximumOfThree maximumOfThreeObject;

    // Test for finding max integer
    @Test
    public void givenInput_whenFirstNumberIsMaximum_shouldReturnMaximum() {
        Integer firstMaximum = (Integer) maximumOfThreeObject.findMaximum(5,2,2,7,4);
        Assert.assertEquals( (Integer)7,firstMaximum);
    }

    // Test for finding max float
    @Test
    public void givenInput_whenFirstFloatIsMaximum_shouldReturnMaximum() {
        Float firstMaximum = (Float) maximumOfThreeObject.findMaximum(1.1f,3.3f,1.2f,2.3f,2.7f);
        Assert.assertEquals((Float)3.3f,firstMaximum);
    }
    // Test for finding max string
    @Test
    public void givenInput_whenFirstStringIsMaximum_shouldReturnMaximum() {
        String firstMaximum = (String) maximumOfThreeObject.findMaximum("asdf","asdfghjkl","a","asd");
        Assert.assertEquals((String)"asdfghjkl",firstMaximum);
    }
}