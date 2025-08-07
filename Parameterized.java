class Parameterized{
int ID,Salary;
String name;
public Parameterized(int ID,String name,int Salary){
this.ID=ID;
this.name=name;
this.Salary=Salary;
}
public static void main(String args[]){
Parameterized p= new Parameterized(1098,"Arti",100000);
System.out.println("Employee Information:");
System.out.println("Employee ID:"+p.ID);
System.out.println("Employee name:"+p.name);
System.out.println("Employee salary:"+p.Salary);

}
}