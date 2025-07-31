import java.util.Scanner;
class Area{
double AreaofCircle(double r){
double A=(double)(3.14*r*r);
return A;
}
}
public class AreaCircle{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Area a=new Area();
double r;
System.out.print("Enter radius of circle:\n");
r=sc.nextDouble();
System.out.print("Area of a triangle is:"+a.AreaofCircle(r));
}
}