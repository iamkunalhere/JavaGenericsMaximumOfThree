public class MaximumOfThree {

    public static int True = 1;
    // Method for finding maximum of three integers
    public static Integer maxInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maxNumber = null;
        if (firstNumber.compareTo(secondNumber) == True && firstNumber.compareTo(thirdNumber) == True ) {
            maxNumber=firstNumber;
        }
        else if (secondNumber.compareTo(firstNumber) == True && secondNumber.compareTo(thirdNumber) == True) {
            maxNumber=secondNumber;
        }
        else if (thirdNumber.compareTo(firstNumber) == True && thirdNumber.compareTo(secondNumber) == True) {
            maxNumber=thirdNumber;
        }
        return maxNumber;
    }
    // Method for finding maximum of three floats
    public static Float maxFloat(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maxNumber = null;
        if (firstNumber.compareTo(secondNumber) == True && firstNumber.compareTo(thirdNumber) == True) {
            maxNumber=firstNumber;
        }
        else if (secondNumber.compareTo(firstNumber) == True && secondNumber.compareTo(thirdNumber) == True) {
            maxNumber=secondNumber;
        }
        else if (thirdNumber.compareTo(firstNumber) == True && thirdNumber.compareTo(secondNumber) == True) {
            maxNumber=thirdNumber;
        }
        return maxNumber;
    }
    // Method for finding maximum of three strings
    public static String maxString(String firstString, String secondString, String thirdString) {
        String maxString = null;
        if (firstString.compareTo(secondString) == True && firstString.compareTo(thirdString) == True) {
            maxString=firstString;
        }
        else if (secondString.compareTo(firstString) == True && secondString.compareTo(thirdString) == True) {
            maxString=secondString;
        }
        else if (thirdString.compareTo(firstString) == True && thirdString.compareTo(secondString) == True) {
            maxString=thirdString;
        }
        return maxString;
    }
}
