import java.util.LinkedList;
import java.util.Queue;

public class TruckCrossingTheBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		System.out.print(solution(bridge_length, weight, truck_weights));
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
		int sum = 0;
		int time = 0; 

		for(int i = 0; i < truck_weights.length; i++) {
			int truck = truck_weights[i];

			while(true) {
				if(queue.isEmpty()) {
					queue.add(truck);
					sum += truck;
					time++;
					break;
				}
				else if(queue.size() == bridge_length) {
					sum -= queue.poll();
				}
				else {
					if(sum + truck <= weight) {
						queue.add(truck);
						sum += truck;
						time++;
						break;
					}
					else {
						queue.add(0);
						time++;
					}
				}
			}
		}

		return time + bridge_length; 
    }
}
