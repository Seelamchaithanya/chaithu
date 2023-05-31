package day9;
interface hi{
	void print();
}
public class interf implements hi{
 public void print() {
	System.out.println("hi");
}
public static void main(String[] args) {
	interf f=new interf();
	f.print();
}
}
