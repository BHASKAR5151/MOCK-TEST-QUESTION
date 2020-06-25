import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Anagram {
	public static void main(String[] args) {

		String[] s = { "cat", "dog", "tac", "god", "act" };
		List<String> l1 = Arrays.asList(s);
		Map<String, List<String>> group = l1.stream().collect(Collectors.groupingBy(str -> {
			char[] c = str.toCharArray();
			Arrays.sort(c);
			return new String(c);
		}));
		group.forEach((k, v) -> System.out.println(v));

	}

}