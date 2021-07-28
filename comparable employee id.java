import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	int age;
	public Employee(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
		
	public int compareTo(Employee em) {
		if (id==em.id)
			return 0;
		else if(id>em.id)
			return 1;
		else
			return -1;
		
		
	}
}

public class CollectionDemo2 {

	public static void main(String[] args) {
		ArrayList<Employee> Emp=new ArrayList<Employee>();
		Emp.add(new Employee(104,"Balu",24));
		Emp.add(new Employee(101,"Kala",21));
		Emp.add(new Employee(99,"Akhil",25));
		Collections.sort(Emp);
		for (Employee em:Emp) {
			System.out.println(em.id+" "+em.name+" "+em.age);

	}

	}

}
