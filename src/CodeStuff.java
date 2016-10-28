
public class CodeStuff {
	public String getFirstThreeChars(String inputString) {
		return inputString.substring(0, 3);

	}

	public int addUnlessSame(int inputInteger1, int inputInteger2) {
		if (inputInteger1 != inputInteger2) {
			return inputInteger1 + inputInteger2;
		}

		else {
			return 0;
		}
	}

	public int[] reduceArrayByHalf(int[] inputArray) {
		int[] x = new int[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			x[i] = (inputArray[i]) / 2;
		}

		return x;

	}

}
