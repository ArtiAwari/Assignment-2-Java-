import java.util.Scanner;
class Parameterized1{
int ID,Salary;
String name;
public Parameterized1(int id,String name,int salary){
this.ID=id;
this.name=name;
this.Salary=salary;
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int id,salary;
String name;
System.out.print("Enter ID:");
id=s.nextInt();
s.nextLine();
System.out.print("Enter Name:");
name=s.nextLine();
System.out.print("Enter Salary:");
salary=s.nextInt();

Parameterized1 p= new Parameterized1(id,name,salary);
System.out.println("Employee Information:");
System.out.println("Employee ID:"+p.ID);
System.out.println("Employee name:"+p.name);
System.out.println("Employee salary:"+p.Salary);

}
}