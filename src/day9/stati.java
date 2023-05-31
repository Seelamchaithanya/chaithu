package day9;
class Student{
	int rollno;
	String name;
	static String college="CBIT";
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+","+name+","+college);
	}
}
public class stati {
	public static void main(String[] args) {
		Student s1=new Student(111,"Chaithu");
		Student s2=new Student(112,"Seelam");
	s1.display();
	s2.display();
}
} 