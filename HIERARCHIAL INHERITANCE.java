import java.util.Scanner;
class Employeee
{
	String name;
	int age;
	long phonenumber;
	String address;
	float salary;
	Employeee(String name1,int age1,long phonenumber1,String address1,float salary1)
	{
		name = name1;
		age = age1;
		phonenumber = phonenumber1;
		address = address1;
		salary = salary1;
	}
	void printEmployee()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone number: "+phonenumber);
		System.out.println("Address: "+address);
    }
	void printSalary()
	{
		System.out.println("Salary:"+salary);
	}
}
class Officer extends Employeee
{
	String specialization;
	Officer(String name1,int age1,long phonenumber1,String address1,float salary1,String specialization1)
	{
		super(name1,age1,phonenumber1,address1,salary1);
		{
			specialization = specialization1;
		}
	}
	void printSpecialization()
	{
		System.out.println("Specialization:"+specialization);
	}
}
class Manager extends Employeee
{
	String department;
	Manager(String name1,int age1,long phonenumber1,String address1,float salary1,String department1)
	{
		super(name1,age1,phonenumber1,address1,salary1);
		{
			department = department1;
		}
	}
	void printDepartment()
	{
		System.out.println("Department:"+department);
		
	}
}
public class HierarchialInheritance
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int age;
		String name,address,specialization,department;
		long phonenumber;
		float salary;
		System.out.println("ENTER THE DETAILS OF OFFICER");
		System.out.println("Enter name:");
		name = sc.next();
		System.out.println("Enter age:");
		age = sc.nextInt();
		System.out.println("Enter phone number:");
		phonenumber = sc.nextLong();
		System.out.println("Enter address:");
		address = sc.next();
	    System.out.println("Enter salary:");
	    salary = sc.nextFloat();
	    System.out.println("Enter specialization:");
	    specialization = sc.next();
	    Officer of = new Officer(name,age,phonenumber,address,salary,specialization);
	    System.out.println("ENTER THE DETAILS OF MANAGER");
	    System.out.println("Enter name:");
		  name = sc.next();
		  System.out.println("Enter age:");
		  age = sc.nextInt();
		  System.out.println("Enter phone number:");
		  phonenumber = sc.nextLong();
		  System.out.println("Enter address:");
		  address = sc.next();
	    System.out.println("Enter salary:");
	    salary = sc.nextFloat();
	    System.out.println("Enter department:");
	    department = sc.next();
	    Manager ma = new Manager(name,age,phonenumber,address,salary,department);
	    System.out.println("DETAILS OF OFFICER:");
	    of.printEmployee();
	    of.printSalary();
	    of.printSpecialization();
	    System.out.println("DETAILS OF MANAGER:");
	    ma.printEmployee();
	    ma.printSalary();
	    ma.printDepartment();
	 }
}
