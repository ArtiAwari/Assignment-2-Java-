public class ThisKeyword1{
int a,b;
public ThisKeyword1(){
this(34,78);
System.out.println("In No Argument Constructor");
}
public ThisKeyword1(int a,int b){
int c=a+b;
System.out.println("Addition is:"+c);
}
public static void main(String args[]){
ThisKeyword1 t=new ThisKeyword1();
}
}