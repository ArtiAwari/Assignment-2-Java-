import java.util.Scanner;
class Area{
double AreaofTriangle(double base,double height){
double A=(double)((0.5)*base*height);
return A;
}
}
public class AreaTriangle{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Area a=new Area();
double base,height;
System.out.print("Enter base of triangle:\n");
base=sc.nextDouble();
System.out.print("Enter height of triangle:\n");
height=sc.nextDouble();
System.out.print("Area of a triangle is:"+a.AreaofTriangle(base,height));
}
}