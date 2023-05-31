import java.util.PriorityQueue;
public class PriorityQueueExample {
public static void main(String[] args) {
	PriorityQueue<Integer> nums=new PriorityQueue<Integer>();
	nums.add(10);
	nums.add(20);
	nums.add(30);
	nums.add(40);
	System.out.println(nums);
	nums.remove(20);
	System.out.println(nums);
}
}

