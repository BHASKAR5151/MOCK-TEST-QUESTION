public class ReverseStringWord {
	public static String reverse(char str[]) {
		if (str != null) {
			int r = str.length - 1, l = 0;
			while (l < r && r > 0) {

				if (!Character.isAlphabetic(str[l]))
					l++;
				else if (!Character.isAlphabetic(str[r]))
					r--;
				else {
					char tmp = str[l];
					str[l] = str[r];
					str[r] = tmp;
					l++;
					r--;
				}
			}
		} else {
			return "0";
		}
		return (str.length > 0) ?  String.valueOf(str): "0";
	}

	public static void main(String[] args) {
		String str = "a@@@b.c.d,e'f,***ghi";
		char[] charArray = str.toCharArray();
		System.out.println("Input string: " + str);
		System.out.println("Output string: " + reverse(charArray));
	}
}