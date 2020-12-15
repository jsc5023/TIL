import java.util.ArrayList;
import java.util.Arrays;

class QuickSortFunction{
	public ArrayList<Integer> quickSort(ArrayList<Integer> array){
		if(array.size() - 1 < 2) {
			return array;
		}
		
		else {
			int pivot = array.get(0);
			
			ArrayList<Integer> less = new ArrayList<Integer>();
			for (int i : array) {
				if(i<=pivot) {
					less.add(i);
				}
			}
			
			ArrayList<Integer> greater = new ArrayList<Integer>();
			for (int i : array) {
				if(i>pivot) {
					greater.add(i);
				}
			}
			
//			ArrayList<Integer> result = new ArrayList<Integer>();
//			quickSort(less).addAll(greater);
			return less;
		}
		
	}
}


public class QuickSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(10,5,2,3));
		
		QuickSortFunction quick = new QuickSortFunction();
		
		System.out.println(quick.quickSort(listOne));
	}

}
