import java. util.*;
public class Employee {

		private
			
			String employeename;
			double employeecnumber;
			char gender;
			String status;
			int officeid;
			
		public  Employee()
			{
				this.employeename = "Null";
				this.employeecnumber = 0;
				this.gender = '0';
				this.officeid=0;
			
			}
			Employee(String empname, double empcnumber, char g, String stat)
			{
				this.employeename = empname;
				this.employeecnumber = empcnumber;
				this.gender = g;
				this.status=stat;

			}
			public void setemployeename(String empname)
			{
				
				
				this.employeename = empname;
			}
			String getemployeename()
			{
				return this.employeename;
			}
			void setemployeecnumber(double empcnumber)
			{
		
				this.employeecnumber = empcnumber;
			}
			double getemployeecnumber()
			{
				return this.employeecnumber;
			}
			void setgender(char g)
			{
				this.gender = g;
			}
			char getgender()
			{
				return this.gender;
			}
			void setstatus(String stat)
			{
			
				this.status = stat;
			}
			String getstatus()
			{
				return this.status;
			}
			void setid()
			{
				Random rand=new Random();
				int officeid = rand.nextInt(50);

			}
			int getid()
			{
				return this.officeid;
			}
			public void show()
			{
				System.out.println("Name: "+this.employeename);
				System.out.println("Number: "+this.employeecnumber);
				System.out.println("Gender: "+this.gender);
				System.out.println("Status: "+this.status);
				System.out.println("Id: "+this.officeid);
			}
			
class Accounting extends Employee{
	



	protected
	int fixsalary;
	int allowance;
	double tax;
	double totalsalary;
	Accounting(String empname, double empcnumber, char g, String stat) {
		super(empname, empcnumber, g, stat);
		// TODO Auto-generated constructor stub
		
	}
	Accounting(){
		this.fixsalary=50000;
		this.allowance=1500;
		this.tax=50000*0.17;
		this.totalsalary=(this.fixsalary+this.allowance)-this.tax;

	}
	public void setfixsalary(int fsalary)
	{
		this.fixsalary=fsalary;
	}
	public int getsalary()
	{
		return this.fixsalary;
	}
	public void setallowance(int allow)
	{
		this.allowance=allow;
	}
	public int getallowance()
	{
		return this.allowance;
	}
	public void settax(double t)
	{
		this.tax=t;
	}
	public double gettax()
	{
		return this.tax;
	}
	public void settotalsalary(double tsalary)
	{
		this.totalsalary=tsalary;
	}
	public double gettotalsalary()
	{
		return this.totalsalary;
	}
	public void display() {
		System.out.println("FIX SALARY: "+this.fixsalary);
		System.out.println("ALLOWANCE: "+this.allowance);
		System.out.println("TAX: "+this.tax);
		System.out.println("TOTAL SALARY: "+this.totalsalary);
		}

			
public  void main()
{
	 Employee emp=new Employee("Ammar",90,'M',"Single");
	 
	 emp.setid();
	 System.out.println("Employee details\n=================\n");
	 emp.show();
	 System.out.println("\n\nAccounts of Employeee\n===================\n");
	 Accounting acc=new Accounting();
	 acc.display();
	 
}}}
	
	
	
