package day12;
class abc extends Thread{
	public void run() {
		Thread.currentThread().setName("run method");
		System.out.println("worker thfread is runnin");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}
public class lifecy {

}
