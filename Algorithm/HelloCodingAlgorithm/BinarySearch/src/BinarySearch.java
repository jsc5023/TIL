public class BinarySearch {

	public int binary_search(int[] list, int item) {
		int low = 0;
		int high = list.length - 1;
		int mid, guess;
		while(low <= high) {
			mid = (low + high) / 2;
			guess = list[mid];
			
			if(guess == item) {
				return mid;
			}
			if(guess > item) {
				high = mid -1;
			}
			else
				low = mid + 1;
		}
		return 100000;
	}
	
	public static void main(String args[]) {
		int[] my_list = {1,3,5,7,9};
		
		BinarySearch binarySearch = new BinarySearch();
		
		System.out.println(binarySearch.binary_search(my_list, 3)); // 1이나옴(두번째 상자의 번호)
		System.out.println(binarySearch.binary_search(my_list, -1)); // 값이없음 -> 100000이 나옴
	}
	

}
