package exercise;

public class Constructor {
public Constructor(int x) {
this.x=x;
}

public Constructor(int x,String Y) {
this.names=Y;
}


int x;//instance variable
static String names;
public void variables() {
	System.out.println("instant values is "+ x);
}

public static void nameofcustomer(int x, String name) {
	System.out.println("custome name is "+ name);
	
	
}
public static void main(String[] args) {
	Constructor ops= new Constructor(1000);
	ops.variables();
	
	Constructor.nameofcustomer(1000,"prav");
}
}
