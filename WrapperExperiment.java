public class WrapperExperiment {
	public static void main(String[] args) {
		
    //Store the `POSITIVE_INFINITY` static field from the `Double` class into a `Double` wrapper object
Double inf = Double.POSITIVE_INFINITY;

    //Unbox the infinitely large `Double` into an `int`
  int result = inf.intValue();

    //Modify the if condition to test if the integer value is equal to the `MAX_VALUE` static field from the `Integer` class

		if(result == Integer.MAX_VALUE) {
			System.out.print("True");
		}

	}
}