package org.cons;

public class Const2 extends Const3 {
	public   Const2() {
	System.out.println("default 2");	
	}
public   Const2(int age) {
	super(100 );
		System.out.println( age);
		
	}
public   Const2(long num) {
	super(121212458l);   
	System.out.println(num);
	
}

	public static void main(String[] args) {
		Const2 c = new Const2();
		Const2 c1 = new Const2(10);
		Const2 c2 = new Const2(12121245l);

	}

}
