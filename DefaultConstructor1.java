public class DefaultConstructor1{
int Salary,ID;
String name;
public DefaultConstructor1()
{
ID=1098;
Salary=100000;
name="Arti";
}
public static void main(String args[]){
DefaultConstructor1 c=new DefaultConstructor1();
System.out.println("Employee Information:");
System.out.println("Employee ID:"+c.ID);
System.out.println("Employee Name:"+c.name);
System.out.println("Employee Salary:"+c.Salary);
}
}