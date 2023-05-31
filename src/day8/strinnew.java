package day8;

public class strinnew {
	public static void main(String[] args) {
		String s1="Hema";
		String s2=new String("Hema");
		if(s1==s2) {
			System.out.println(" reference are equal");
		}
		else {
			System.out.println("reference are not equal");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("String are equal");
		}
		else {
			System.out.println("String are not equal");
		}
	}
	}


