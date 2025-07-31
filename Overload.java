import java.util.Scanner;
public class Overload{
int id;
int Sal;
String name;
String Dep;
public Overload(){
id=98;
Sal=100000;
name="Arti";
System.out.println("ID="+id+"  Name="+name+"   Salary="+Sal);
}
public Overload(int Id,String n,int sal){
id=Id;
name=n;
Sal=sal;
System.out.println("ID="+id+"  Name="+name+"   Salary="+Sal);
}
public Overload(int Id,String n){
id=Id;
name=n;
System.out.println("ID="+id+"  Name="+name);
}
public static void main(String args[]){
Overload o1=new Overload();
Overload o1=new Overload(100,"Reva",12000);
Overload o1=new Overload(113,"Purva");
}
}