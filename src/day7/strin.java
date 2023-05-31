package day7;

public class strin {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Hello");
	System.out.println("Before modification:" +sb);
	sb.append("World");
	System.out.println("After append:" +sb);
}
}
