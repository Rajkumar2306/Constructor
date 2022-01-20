package org.cons;

public class Const1 extends Const2 {

	
  public  Const1() {
	this(10);
}
  public  Const1(int age) {
	  this ("Raj");
		System.out.println(age);
		System.out.println("kumar diner");
  }
  public  Const1(String name) {
	  this(12121245l);
	  System.out.println(name);
  }
  public  Const1(long num) {
	  this (2555.255f);
	  System.out.println(num);
  }
  public  Const1(Float salary ) {
	  System.out.println(salary);
  }
	public static void main(String[] args) {
		Const1 s= new Const1(10);

	}

}
