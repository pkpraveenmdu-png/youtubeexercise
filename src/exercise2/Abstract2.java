package exercise2;

public class Abstract2 extends Abstructexercise {

	@Override
	public void mobile() {
		// TODO Auto-generated method stub
		System.out.println("play music");
	}

	@Override
	public void callfunction() {
		// TODO Auto-generated method stub
		System.out.println("Make video call");	
	}

public static void main(String[] args) {
	Abstract2 ops= new Abstract2();
	ops.mobile();
	ops.callfunction();
}

}
//********************************8
//package exercise2;
//
//public class Abstract2 extends Abstructexercise {
//
//	@Override
//	public void mobile() {
//		System.out.println("play music");
//	}
//
//	@Override
//	public void callfunction() {
//		System.out.println("Make video call");
//	}
//
//	public static void main(String[] args) {
//		Abstract2 ops = new Abstract2();
//		ops.mobile();
//		ops.callfunction();
//	}
//}