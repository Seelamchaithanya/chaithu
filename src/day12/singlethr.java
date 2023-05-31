package day12;
import  java.util.Scanner;
class chaithu extends Thread{
	public void run()
	{
		System.out.println("assignment is ended");
	}
}
public class singlethr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("student started writing assignment");
	System.out.println("enter which chapter assignment he has to write");
	int a=sc.nextInt();
	for(int i=0;i<4;i++) {
		System.out.println("cbit");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
}
