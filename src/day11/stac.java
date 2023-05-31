package day11;
import java.util.PriorityQueue;
public class stac {
public static void main(String[] args) {
	PriorityQueue<Integer> d=new PriorityQueue<Integer>();
	d.add(10);
	d.add(20);
	d.add(30);
	d.add(40);
	System.out.println(d);
	d.remove(20);
	System.out.println(d);
}
}
