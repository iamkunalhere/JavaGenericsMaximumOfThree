import java.util.Arrays;

public class  MaximumOfThree <E extends Comparable<E>>{
    // Array arguments of type E
    E[] arguments;
    // Constructor for initialization of array elements
    public MaximumOfThree(E[] array) {
        this.arguments=array;
    }
    // method to find maximum in given array
    public static <E extends Comparable<E>> E findMaximum(E... arguments) {
        Arrays.sort(arguments);
        E maximum = arguments[arguments.length-1];
        printMax(maximum);
        return arguments[arguments.length-1];
    }
    // method to print maximum from given array
    private static <E extends Comparable<E>> void printMax(E maximum) {
        System.out.println("Maximum is "+maximum);
    }

}
