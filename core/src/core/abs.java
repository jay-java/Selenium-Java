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
class StaticCAll{
	int id;
	String name;
	static String sname = "TOPS";
	public StaticCAll(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void calling() {
		System.out.println("calling method calling");
	}
	public static void staticCalling() {
		System.out.println("static method calling");
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" sname : "+sname ;
	}
}
public class abs {
	public static void main(String[] args) {
		StaticCAll s1 = new StaticCAll(1, "jical");
		StaticCAll s2 = new StaticCAll(2, "krunal");
		StaticCAll s3 = new StaticCAll(3, "keyur");
		StaticCAll s4 = new StaticCAll(4, "sharon");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		s1.calling();
		StaticCAll.staticCalling();
	}
}
