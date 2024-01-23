package Day14;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
		int [] array = {9,6,7,3,2,1,5,4};
		Arrays.sort(array);
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
