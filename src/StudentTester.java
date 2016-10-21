import java.util.ArrayList;
import java.util.Collections;

/**
 * This is the entry point for Team Assignment 1
 * @author Team Demo
 *
 */
public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 
import java.util.Comparator;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<student> students = new ArrayList<student>();
		
		student tempStudent = new student("Joe",60);
		
		
		students.add(tempStudent);
		students.add(new student("Ram", 50));
		students.add(new student ("Damla", 100));
		
		
		System.out.println(students.get(0).toMyString());
		
		// students.sort(student.compareTo());
		
		// or students.sort(comparestudents());
		
		Collections.sort(students, new Comparator<student>(){
			public int compare (student s1, student s2) { 
			return 1; 	
			// return 1 if s1.points > s2.points 
			// return 0 if s1==s2 
			// return -1 if s1 < s2 
			}
		});
		
}
}
