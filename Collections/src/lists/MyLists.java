package lists;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;
	private String surname;
}

public class MyLists {
	
	public static void main(String[] args) {
		{
			ArrayList aobject = new ArrayList();
			
			aobject.add("Pippo");
			aobject.add(new Person());
			
			int x = 5;
			Integer ix = x; // Boxing "Sempre OK"
			
			int y = ix; // Unboxing "Potrebbe dare problemi". Perch+ un oggetto può essere null
			
			aobject.add(x); // Perchè c'è il boxing 
			Object o1 = aobject.get(1);
			if (o1 instanceof Person) {
				Person p1 = (Person)o1;
			}
		}
		
		{
			ArrayList<String> astring = new ArrayList<String>();
			astring.add("Pippo");
			//astring.add(new Person()); Una persona non può essere assegnata
			astring.add("Prova");
			
			String s = astring.get(1);
			System.out.println(s);
		}
		
		{
			ArrayList<Person> aperson = new ArrayList<>();
			aperson.add(new Person());
		}
		
		{
			// Covariance
			List<Person> apersonlist = new ArrayList<>();
			apersonlist.add(new Person());
		}
		
		{
			// Contains (indexOf)
			List<String> ls = new ArrayList<>();
			ls.add("s1");
			ls.add("s2");
			ls.add("s3");
			ls.add("s4");
			System.out.println("Contiene s3?" + ls.contains("s3"));
			System.out.println("Contiene s5?" + ls.contains("s5"));
		}
	}
}
