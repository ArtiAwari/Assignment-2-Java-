public class DefaultConstructor{
int Salary,ID;
String name;
public DefaultConstructor()
{
ID=1098;
Salary=100000;
name="Arti";
}
public void display()
{
System.out.println("Employee Information:");
System.out.println("Employee ID:"+ID);
System.out.println("Employee Name:"+name);
System.out.println("Employee Salary:"+Salary);
}
public static void main(String args[]){
DefaultConstructor c=new DefaultConstructor();
c.display();
}
}