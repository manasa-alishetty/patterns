class Person {

	String name;
	int age;
	public Person(String n1,int a1)
	{
		name=n1;
		age=a1;
	}
	void m1()
	{
		System.out.println("par");
	}
}
class Employee extends Person
{
	int salary;
	
	public Employee(String n1,int a1,int s1)
	{
		super(n1,a1);
		int salary=s1;
	}
	void m2()
	{
		System.out.println("child");
	}
	public  void main(String[] args)
		{
			Employee e1=new Employee("a",21,12);
			e1.m1();
		}
		}
	