package org.emp;
import java.util.Scanner;
public class Employee {
	public void employee() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("employee Id is");
		int id=s.nextInt();
		System.out.println("employee Id is = "+id);
		
		System.out.println("employee salary is");
		int salary=s.nextInt();
		System.out.println("emp salary is"+salary);
		
		System.out.println("enter the phno");
		long phno=s.nextLong();
		System.out.println("phno is"+phno);
		
		System.out.println("emp name is");
        String name=s.next();
        System.out.println("emp name is"+name);
        
        System.out.println("emp city is");
        String city=s.next();
        System.out.println("emp city is"+city);
        
        System.out.println("emp gender is");
        String gender=s.next();
        System.out.println("emp gender"+gender);
		
	}
    public static void main(String[] args) {
	Employee e=new Employee();
	e.employee();
}	

}
