import static org.junit.Assert.assertEquals;

import org.junit.internal.TextListener;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

public class LargestSum {

	public static void main(String[] args) {

		int[] i = { -2, 1, -3, 4, -1, 2, 1, -5, 4 }; // { 1, 2, -1, 2, -3, 2, -5 };
		int sum = largeSum(i);
		System.out.println(sum);
	}

	private static int largeSum(int[] arr) {
		int sum = 0, maxsum = 0;
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
				if (sum < 0)
					sum = 0;
				if (maxsum < sum)
					maxsum = sum;
			}
		}
		return maxsum;
	}

	public static class TestLargestSum {

		public static void main(String[] args) {
			JUnitCore junit = new JUnitCore();
			junit.addListener(new TextListener(System.out));
			junit.run(LargestSum.TestLargestSum.class);
		}

		@Test
		public void testLarge() {
			int[] input = { 6, 4, -2 };
			int actual = LargestSum.largeSum(input);
			assertEquals(10, actual);
		}

		@Test
		public void testLarge2WithEmpty() {
			int[] input = { 2, 3, 4 };
			int actual = LargestSum.largeSum(null);
			assertEquals(0, actual);
		}

	}
}
