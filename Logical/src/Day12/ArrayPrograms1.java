package Day12;

public class ArrayPrograms1 {
  public static void main(String[] args) {
	int array[] = {5,4,3,2,1,4,5,6,3,7};
	int min = array[0];
	for(int i = 0; i<array.length; i++) {
		if(array[i]<min) {
			min=array[i];
		}
	}
	System.out.println(min);
}
}
