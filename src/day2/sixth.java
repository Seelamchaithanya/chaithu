package day2;
import java.util.Scanner;
public class sixth {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a%4==0||a%400==0) {
		System.out.println(a+"is a leap year");
	}
		else {
			System.out.println(a+"not a leap year");
		}
		
	}
}

