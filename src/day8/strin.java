package day8;

public class strin {
public static void main(String[] args) {
	String s1="CBIT";
	String s2="CBIT";
	if(s1==s2) {
		System.out.println("reference are equal");
	}
	else {
		System.out.println("reference are not equal");
	}
	if(s1.equals(s2)) {
		System.out.println(" string are equal");
	}
	else {
		System.out.println("String are not equal");
	}
}
}
