import static org.junit.Assert.assertEquals;

import org.junit.internal.TextListener;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

public class WordLength {

	public static void main(String[] args) {
		String s = "geeks for geeks contribute practice hello geeks how geeks practice";
		String w1 = "geeks";
		String w2 = "practice";

		int count = wordCount(s, w1, w2);
		if (count < 0) {
			System.out.println("Please provide proper input ");
		} else {
			System.out.println("Word Distance : " + count);
		}
	}

	static int wordCount(String s, String w1, String w2) {

		if (s == null || s.equals(" ") || w1.equals(w2))
			return -1;

		String words[] = s.split(" ");

		int min_dist = (words.length) + 1;
		for (int index = 0; index < words.length; index++) {
			if (words[index].equals(w1)) {
				for (int search = 0; search < words.length; search++) {
					if (words[search].equals(w2)) {
						int curr = Math.abs(index - search) - 1;
						if (curr < min_dist) {
							min_dist = curr;
						}
					}
				}
			}
		}

		return min_dist;
	}

	public static class TestWordLength {

		public static void main(String[] args) {
			JUnitCore junit = new JUnitCore();
			junit.addListener(new TextListener(System.out));
			junit.run(WordLength.TestWordLength.class);
		}

		@Test
		public void TestWordLength1() {
			String s = "geeks for geeks contribute practice hello geeks how geeks practice";
			String w1 = "geeks";
			String w2 = "practice";
			int actual = WordLength.wordCount(s, w1, w2);
			assertEquals(0, actual);
		}

		@Test
		public void TestWordLength2() {
			String s = "geeks for geeks contribute hi hello how practice";
			String w1 = "geeks";
			String w2 = "practice";
			int actual = WordLength.wordCount(s, w1, w2);
			assertEquals(4, actual);
		}

		@Test
		public void TestWordLengthWithEmpty() {
			String s = "geeks for geeks contribute hi hello geeks how practice";
			String w1 = "geeks";
			String w2 = "practice";
			int actual = WordLength.wordCount(null, w1, w2);
			assertEquals(-1, actual);
		}

	}

}
