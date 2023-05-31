package day8;

public class conca {
public static void main(String[] args) {
	String s1="Chaithu";
	String s2="Seelam";
	String s3=s1.concat(s2);
	String s4=s1.concat(s2);
	if(s3==s4) {
		System.out.println("reference are equal");
	}
	else {
		System.out.println("reference are not equal");
	}
	if(s3.equals(s4)) {
		System.out.println("String are equal");
	}
	else {
		System.out.println("String are not eqaul");
	}
}
}
