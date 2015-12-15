
public class Main {
	public static void main(String[] args) {
		
		Student riccardo = new Student();
		
		riccardo.name = "Riccardo";
		riccardo.surname = "Nobile";
		
		int age = 19;
		riccardo.age = age;
		
		riccardo.marks = new int[] {3, 2, 4, 1};
		
		System.out.println("Riccardo marks: " + riccardo.marks[2]);
		
		Student alessandro = new Student();
		
		alessandro.name = "Alessandro";
		alessandro.surname = "Modaffari";
		
		alessandro.age = age;
		
		alessandro.marks = new int[] {7, 2, 8, 7};
		
		System.out.println("Alessandro marks: " + riccardo.marks[2]);
	}
}
