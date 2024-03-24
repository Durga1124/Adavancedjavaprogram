package java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> a1=new ArrayList<Student>();
		
		int rno[]= {1,3,2,4,5};
		
		String name[]= {"sachin","kapil","rahul","dhoni","prasad"};
		int age[]= {35,32,36,35,38};
		
		for(int i=0;i<rno.length;i++)
		{
			Student s=new Student();
			s.setRollno(rno[i]);
			s.setName(name[i]);
			s.setAge(age[i]);
			a1.add(s);
		}
		Comparator<Student> comp=Comparator.comparing(Student::getName);
		Collections.sort(a1, comp);;
		
		for(Student x:a1)
			System.out.println(x.getRollno()+""+x.getName()+""+x.getAge());
		Comparator<Student> comp1=Comparator.comparing(Student::getAge);
		Collections.sort(a1, comp1);;
		
		for(Student x:a1)
			System.out.println(x.getRollno()+""+x.getName()+""+x.getAge());
		Comparator<Student> comp2=Comparator.comparing(Student::getRollno);
		Collections.sort(a1, comp2);;
		
		for(Student x:a1)
			System.out.println(x.getRollno()+""+x.getName()+""+x.getAge());
	}

}
