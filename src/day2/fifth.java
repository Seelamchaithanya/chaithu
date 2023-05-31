package day2;
import java.util.Scanner;
public class fifth {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a>18) {
		System.out.println(a+ "eligable for vote");
	}
		else if((a >18)&&(a<100)){
			System.out.println(a+ "eligable for vote");
		}
			else {
				System.out.println(a+"default");
			}
	}
}
	
	
	
		

