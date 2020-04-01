import java.util.Arrays;

public class  MaximumOfThree <E extends Comparable<E>>{

    E[] arguments;

    public MaximumOfThree(E[] array) {
        this.arguments=array;
    }
    public static <E extends Comparable<E>> E findMaximum(E... arguments) {
        Arrays.sort(arguments);
        return arguments[arguments.length-1];
    }
}
