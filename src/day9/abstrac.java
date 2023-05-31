package day9;

abstract class car{
	public abstract drive();
	public void playmusic() {
		System.out.println("music is playing");
	}
}
abstract class waganor extends car{
	public abstract fly();	public void drive() {
		System.out.println("Driving");
	}
}
class updatewaganor extends waganor{
	public void fly() {
		System.out.println("flying...");
	}
}
public class abstrac {
	public static void main (String[] args) {
		updatewaganor uw=new updatewaganor();
		uw.playmusic();
		uw.drive();
		uw.fly();
	}
}
