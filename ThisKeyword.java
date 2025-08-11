import java.util.Scanner;
public class ThisKeyword{
int ID;
String name;
int Salary;
public ThisKeyword(int ID,String name,int Salary){
this.ID=ID;
this.name=name;
this.Salary=Salary;
}
public void display(){
System.out.println("...Employee Information...");
System.out.println("Employee ID:"+ID);
System.out.println("Employee Name:"+name);
System.out.println("Employee Salary:"+Salary);
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int id,salary;
String n;
System.out.print("Enter Employee ID:");
id=s.nextInt();
System.out.print("Enter Employee Name:");
n=s.next();
System.out.print("Enter Employee Salary:");
salary=s.nextInt();
ThisKeyword t=new ThisKeyword(id,n,salary);
t.display();
}
}