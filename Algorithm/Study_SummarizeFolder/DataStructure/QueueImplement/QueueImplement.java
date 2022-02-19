import java.util.ArrayList;

public class QueueImplement<T> {
	
	private ArrayList<T> queue = new ArrayList<T>();
	
	public void enqueue(T item) {
		queue.add(item);
	}
	
	public T dequeue() {
		if(queue.isEmpty()) {
			return null;
		}
		else {
			return queue.remove(0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImplement<Integer> mq = new QueueImplement<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
	}

}