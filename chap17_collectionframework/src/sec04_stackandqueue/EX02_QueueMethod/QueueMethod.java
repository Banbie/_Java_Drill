package sec04_stackandqueue.EX02_QueueMethod;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
	public static void main(String[] args) {
		// 1. exception 구현 필수
		Queue<Integer> queue1 = new LinkedList<>();
//		System.out.println(queue1.element()); // NoSuchElementException
		// 1-1 add(E)
		queue1.add(3);
		queue1.add(4);
		queue1.add(5);
		// 1-2 element()
		System.out.println(queue1.element());
		// 1-3 E remove()
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
//		System.out.println(queue1.remove()); // NoSuchElementException
		System.out.println();
		
		// 2. exception 구현 필요 없음
		Queue<Integer> queue2 = new LinkedList<>();
		System.out.println(queue1.peek());
		// 2-1 offer(E)
		queue2.offer(3);
		queue2.offer(4);
		queue2.offer(5);
		// 2-2 E peek()
		System.out.println(queue2.peek());
		// 2-3 E poll()
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
	}
}
