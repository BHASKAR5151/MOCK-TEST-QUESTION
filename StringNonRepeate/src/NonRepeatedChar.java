import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class NonRepeatedChar {
	private static final Logger LOG = Logger.getLogger(NonRepeatedChar.class.getName());

	public interface Solver {
		/**
		 * This method finds the first non repeated character in a word
		 *
		 * @param word The input where we're looking for the first non reapeated
		 *             character
		 * @return a single character or [empty] in all other cases.
		 */
		Optional<Character> firstNonRepeated(String word);

	}

	private static class SolverImpl implements Solver {

		@Override
		public Optional<Character> firstNonRepeated(final String s) {
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			Optional<String> str = Optional.of(s);
			if (str.isPresent()) {
				for (int i = 0; i < s.length(); i++) {
					Character c = s.charAt(i);
					if (map.containsKey(c)) {
						map.put(c, map.get(c) + 1);
					} else {
						map.put(c, 1);
					}
				}
				for (int j = 0; j < s.length(); j++) {
					if (map.get(s.charAt(j)) > 1) {
						return Optional.of(Character.valueOf(s.charAt(j)));
					}
				}
			}
			return Optional.empty();
		}
	}

	public static void main(String[] args) throws IOException {
		LOG.info("Starting");

		SolverImpl solver = new SolverImpl();
		Optional<Character> notRepeated = solver.firstNonRepeated("jayram");
		LOG.info((notRepeated.map(String::valueOf).orElse("<NULL>")));
	}

	public static class SolverTest {
		public static void main(String[] args) {
			JUnitCore junit = new JUnitCore();
			junit.addListener(new TextListener(System.out));
			junit.run(NonRepeatedChar.SolverTest.class);
		}

		@Test
		public void testRepeatedChar() {

			Optional<Character> expected = Optional.of('b');
			SolverImpl solverImpl = new SolverImpl();
			Optional<Character> actual = solverImpl.firstNonRepeated("abhay");
			Assert.assertEquals(expected, actual);
		}

		@Test
		public void testRepeatedCharForNull() {

			Optional<Character> expected = Optional.empty();
			SolverImpl solverImpl = new SolverImpl();
			Optional<Character> actual = solverImpl.firstNonRepeated(null);
			Assert.assertEquals(expected, actual);

		}

	}

}