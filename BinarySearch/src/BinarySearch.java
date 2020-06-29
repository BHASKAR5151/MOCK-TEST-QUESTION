import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 10, 12, 14, 22, 36, 48 };
		System.out.print("Enter the element to be searched: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		Arrays.sort(arr);
		boolean result = binarySearch(arr, 0, arr.length - 1, num);

		if (result)
			System.out.println("Given number found");
		else
			System.out.println("Given number not found");
	}

	public static boolean binarySearch(int[] arr, int first, int last, int search) {

		boolean flag = false;
		if (arr != null) {
			while (first <= last) {
				int mid = (first + last) / 2;
				if (arr[mid] < search) {
					first = mid + 1;
				} else if (arr[mid] == search) {
					flag = true;
					return flag;
				} else {
					last = mid - 1;
				}
			}
			if (first > last) {
				flag = false;
			}
		}
		return flag;

	}
}