package core;
abstract class Parent{
	abstract public void message();
}
class Sub1 extends Parent{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is first subclass");
	}
	
}
class Sub2 extends Parent{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass");
	}
	
}
public class abs {
	public static void main(String[] args) {
		Sub1 s1 = new Sub1();
		s1.message();
		Sub2 s2 = new Sub2();
		s2.message();
	}
}