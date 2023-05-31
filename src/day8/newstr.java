package day8;

public class newstr {
public static void main(String[] args) {
	String s1=new String("Chaithu");
	String s2=new String("Chaithu");
	if(s1==s2) {
		System.out.println("reference are equal");
	}
		else {
			System.out.println("reference are not equal");
		}
		if(s1.equals(s2)) {
			System.out.println("String are equal");
			}
		else {
			System.out.println("String are not equal");
		}
	}
}

