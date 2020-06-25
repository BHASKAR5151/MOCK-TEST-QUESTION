import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Optional;
import java.util.Scanner;

import org.junit.internal.TextListener;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

public class SubStringLength {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your String:");
		String str = input.next();
		int[] arr = findSubstring(str);
		System.out.println("[" + arr[0] + ", " + arr[1] + "]");
	}

	private static int[] findSubstring(String str) {
		int len = 0;
		int maxLength = 0;
		int index = -1;
		int i = 0;
		int[] a = new int[2];
		Optional<String> p=Optional.ofNullable(str);
		if(p.isPresent()) {
		for (i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1))
				len++;
			else {
				if (maxLength <= len) {
					maxLength = len + 1;
					index = i - len - 1;
				}
				len = 0;
			}
		}}
		if (maxLength < len) {
			maxLength = len + 1;
			index = i - len - 1;
		}
		a[0] = index;
		a[1] = maxLength;
		return a;

	}

	public static class TestSubStringLength {

		public static void main(String[] args) {
			JUnitCore junit = new JUnitCore();
			junit.addListener(new TextListener(System.out));
			junit.run(SubStringLength.TestSubStringLength.class);
		}

		@Test
		public void testLastRepeate() {
			int[] exepected = { 6, 4 };
			int[] actual = SubStringLength.findSubstring("aaadddccccf");
			assertArrayEquals(exepected, actual);
		}
		@Test
		public void testLastRepeateWithEmpty() {
			int[] exepected = { -1, 0 };
			int[] actual = SubStringLength.findSubstring(null);
			assertArrayEquals(exepected, actual);
		}
		
	}
}
