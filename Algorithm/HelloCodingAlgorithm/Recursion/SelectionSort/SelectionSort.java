import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
	
	public int findSmallest(ArrayList<Integer> arr) {
		int smallest = arr.get(0);
		int smallest_index = 0;
		
		for(int i=1; i<arr.size(); i++ ) {
			if(arr.get(i) < smallest) {
				smallest = arr.get(i);
				smallest_index = i;
			}
		}
		
		return smallest_index;
	}
	
	public ArrayList<Integer> selectionSort(ArrayList<Integer> arr) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		int arrSize = arr.size();
		int smallest;
		for(int i=1; i<=arrSize; i++) {
			smallest = findSmallest(arr);
			newArr.add(arr.remove(smallest));
		}
		
		return newArr;
	}
	
	public static void main(String args[]) {
		SelectionSort Test = new SelectionSort();
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(5,3,6,2,10));
		
		System.out.println(Test.selectionSort(list));
	}
}
