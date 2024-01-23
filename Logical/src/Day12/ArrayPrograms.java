package Day12;

public class ArrayPrograms {
	public static void main(String[] args) {
		int array[] = { 4, 5, 3, 2, 8, 7, 5 };
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min);

	}
}
