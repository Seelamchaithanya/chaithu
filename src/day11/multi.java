package day11;
class chaithu extends Thread{
	public void main() {
		System.out.println("This thread internally called");
	}
}
public class multi {
public static void main(String[] args) {
	for(int i=0;i<=6;i++) {
		System.out.println("Main thread");
		try {
		Thread.sleep(5000);	
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
chaithu c=new chaithu();
c.run();
}
}
