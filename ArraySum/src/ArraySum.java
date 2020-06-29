import java.util.HashMap;
import java.util.Map;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 5, 17, -1 }, sum = 7;
		String response = arraySum(arr, sum);
		System.out.println(response);
	}

	public static String arraySum(int[] arr, int sum) {
		int count = 0;
		StringBuffer sb = new StringBuffer();
		Map<Integer, Integer> m = new HashMap<>();
		if (arr != null && !(arr.length == 0)) {
			for (int i = 0; i < arr.length; i++) {
				if (m.containsKey(arr[i])) {
					count++;
					sb.append("{" + arr[i] + "," + m.get(arr[i]) + "}");
				} else {
					m.put(sum - arr[i], arr[i]);
				}

			}
		}
		return sb.toString();
	}
}
