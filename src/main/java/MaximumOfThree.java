public class  MaximumOfThree {
    public static <E extends Comparable<E>> E findMaximum(E firstArgument, E secondArgument, E thirdArgument) {
        E max = null;
        int True = 1;
        if (firstArgument.compareTo(secondArgument) == True && firstArgument.compareTo(thirdArgument) == True) {
            max=firstArgument;
        }
        else if (secondArgument.compareTo(firstArgument) == True && secondArgument.compareTo(thirdArgument) == True) {
            max=secondArgument;
        }
        else if (thirdArgument.compareTo(firstArgument) == True && thirdArgument.compareTo(secondArgument) == True){
            max=thirdArgument;
        }
        return max;
    }
}
