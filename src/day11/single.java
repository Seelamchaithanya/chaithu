package day11;
import java.util.Scanner;
class chaithu extends Thread
{
	public void run()
	{
		System.out.println("assignment is ended");
	}
}
public class single {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("student writing assignment");
	System.out.println("from which chapter the student did write assignment");
	int n=sc.nextInt();
	for(int i=0;i<4;i++) {
		System.out.println("CBIT");
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	chaithu c=new chaithu();
	c.run();
int a=40;
int b=20;
int d=a*b;{
System.out.println("multiplication is started");
System.out.println(+d+" ");
System.out.println("multipilication is ended");
}
}
}
