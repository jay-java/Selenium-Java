package core;

import java.util.Scanner;
class A extends B implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
class B{
	
}
class C{
	
}







public class qqqq {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			if (i == 1) {
				System.out.println(1);
			} else if (i == 2) {
				System.out.println(2);
			} else if (i == 3) {
				System.out.println(3);
			} else if (i == 4) {
				System.out.println(4);
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("etner i = ");
		int i1 = sc.nextInt();
		switch (i1) {
		case 1: {
			System.out.println(1);
			break;
		}
		case 2: {
			System.out.println(2);
			break;
		}
		case 3: {
			System.out.println(3);
			break;
		}
		case 4: {
			System.out.println(4);
			break;
		}
		default:
			System.out.println("invalid");
		}
	}
}
