package lab;


 class D {
int i;
int j;
public D() {
	super();
	// TODO Auto-generated constructor stub
}
public D(int i,int j){
this.i=i;
this.j=j;
}
public void printName() {
System.out.println("Name-D");
}
}
public class Test{
public static void main (String[] args){
D d = new D();
d.printName();

}
}

