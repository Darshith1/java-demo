package arr_str;

public class array_exp {
	public static void main(String[] args) {
		int[]  arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < arr.length; i++) {
			//System.out.print(i);
			System.out.print(arr[i]);
		}
		
		System.out.println("\n......reverse order is .......");
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);

		}
	}
}
