package exercise2;

public class Carclass implements Interfaceexcer{

	@Override
	public void mobile() {
		// TODO Auto-generated method stub
		System.out.println("My mobile model is oppo");
	}

	@Override
	public void callfunction() {
		// TODO Auto-generated method stub
		System.out.println("Make a video call");
	}

	@Override
	public void mobilegames() {
		// TODO Auto-generated method stub
		System.out.println("play Pubg game");
	}
	
public static void main(String[] args) {
	Carclass classop=new Carclass();
	classop.mobile();
	classop.callfunction();
	classop.mobilegames();
}
}
