public class  MaximumOfThree <E extends Comparable<E>>{

    E firstArgument,secondArgument,thirdArgument;

    public MaximumOfThree(E firstArgument,E secondArgument,E thirdArgument) {
        this.firstArgument=firstArgument;
        this.secondArgument=secondArgument;
        this.thirdArgument=thirdArgument;
    }
    public E findMaximum() {
        return MaximumOfThree.findMaximum(firstArgument,secondArgument,thirdArgument);
    }

    private static <E extends Comparable<E>> E findMaximum(E firstArgument, E secondArgument, E thirdArgument) {
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
