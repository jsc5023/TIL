import java.util.Stack;

public class TruckCrossingTheBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		System.out.print(solution(bridge_length, weight, truck_weights));
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Stack<Integer> bridgeIn = new Stack<>();
        Stack<Integer> bridgeOut = new Stack<>();
        
        int cnt = 0;
        int index = 0;
        int[] passcnt = new int[truck_weights.length];
        while(bridgeOut.size() < truck_weights.length) {
        	
        	int nowTruckBridgeIn = 0;
        	
        	if(!bridgeIn.isEmpty() && ) {
        		bridgeOut.add(bridgeIn.get(0));
        		bridge
        	}
        		
        	for (int i = 0; i < bridgeIn.size(); i++) {
        		nowTruckBridgeIn += bridgeIn.get(i);
			}
        	
        	if(nowTruckBridgeIn+truck_weights[index] <= weight) {
        		bridgeIn.add(truck_weights[index]);
        	}
        	
        	
        	
        	
        	cnt++;
        	pass++;
        }
        
        return answer;
    }
}
