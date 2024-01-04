class Employee
{
	String name;
	int age;
	int phoneNum;
	String address;
	double salary;
	public void printSalary()
	{
		System.out.println("The salary of employee is: "+salary);
	}
}
class Officer extends Employee
{
	String specialization;
	
}
class Manager extends Employee
{
	String department;
}
public class Inheritance
{
	public static void main(String[] args)
	{
		Officer o1 = new Officer();
		Manager m1 = new Manager();
		o1.name = "Abcd";
		o1.age = 30;
		o1.phoneNum = 89712492;
		o1.address = "Xyz";
		o1.salary = 3400000;
		o1.specialization = "AI";
		
		m1.name = "bcdaty";
		m1.age = 30;
		m1.phoneNum = 89712492;
		m1.address = "Xyzabcs";
		m1.salary = 4400000;
		m1.department = "Tech";
		
		System.out.println("\nOfficer Details:");
		System.out.println("Name: " + o1.name);
		System.out.println("Age: " + o1.age);
		System.out.println("Phone Number: " + o1.phoneNum);
		System.out.println("Address: " + o1.address);
		o1.printSalary();
		System.out.println("Specialization: " + o1.specialization);

		System.out.println("\nManager Details:");
		System.out.println("Name: " + m1.name);
		System.out.println("Age: " + m1.age);
		System.out.println("Phone Number: " + m1.phoneNum);
		System.out.println("Address: " + m1.address);
		m1.printSalary();
		System.out.println("Department: " + m1.department);

		
	}
}
