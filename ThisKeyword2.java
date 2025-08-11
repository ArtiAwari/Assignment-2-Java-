public class ThisKeyword2{
public void display(){
this.Show();
System.out.println("In display method");
}
public void Show(){
System.out.println("In Show method");
}
public static void main(String args[]){
ThisKeyword2 t=new ThisKeyword2();
t.display();
}
}