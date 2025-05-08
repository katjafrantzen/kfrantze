package exercise1;

public class WrappersVsPrimitives {
	public static void main(String[] args) {
		char[] values = { '1', 'a', '3', 'z', '9' };
		int[] nums = { 10, 0, -4, 20, 5 };

		// You can call your methods here and print results
		// Example:
		// System.out.println(countDigitsPrimitive(values));
	}

	// Task A: Count digits using only primitives (e.g., ASCII comparison)
	public static int countDigitsPrimitive(char[] values) {
		int count = 0;
		for (int c : values) {
			if (values[c] <= 97) {
				count++;
			}
		}
		return count;
	}

	// Task B: Count digits using Character.isDigit()
	public static int countDigitsWrapper(char[] values) {
		int count = 0;
		for (int c : values) {
			if (Character.isDigit(values[c]))
				count++;
		}
		return count;
	}

	// Task C: Find max using only primitives
	public static int maxPrimitive(int[] nums) {
		int max = nums[1];
		for (int n : nums) {
			if (nums[n] > max)
				max = nums[n];
		}
		return max;
	}

	// Task D: Find max using Integer.compare()
	public static int maxWithWrapper(int[] nums) {
		int max = nums[1];
		for (int n : nums) {
			if (Integer.compare(nums[n], max) > 0)
				max = nums[n];
		}
		return max;
	}

}
