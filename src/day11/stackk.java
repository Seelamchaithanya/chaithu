package day11;
import java.util.*;
public class stackk {
	public static void main(String[] args) {
		ArrayDeque<Integer> names= new ArrayDeque<Integer>();
		names.addFirst(10);
		names.addLast(20);
		names.offerFirst(30);
		names.offerLast(40);
		System.out.println(names);
		names.remove(10);
		System.out.println(names);
	}
}
