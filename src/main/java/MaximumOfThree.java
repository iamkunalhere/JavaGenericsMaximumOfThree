public class MaximumOfThree {

    public static Integer maxInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {

        Integer maxNumber = null;
        Integer True = 1;
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
}
