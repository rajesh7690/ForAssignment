import java.util.Arrays;
import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			int swapIndex = rand.nextInt(arr.length);
			int mem = arr[swapIndex];
			arr[swapIndex] = arr[i];
			arr[i] = mem;
		}
		System.out.println(Arrays.toString(arr));
	}
}