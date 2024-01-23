package demo;

class A1 extends Thread {
	Table table;

	public A1(Table table) {
		this.table = table;
	}
	public void run() {
		table.table(2);
	}
}

class B1 extends Thread {
	Table table;

	public B1(Table table) {
		this.table = table;
	}
	public void run() {
		table.table(5);
	}
}

class C extends Thread {
	Table table;
	public C(Table table) {
     this.table=table;
	}
	public void run() {
		table.table(20);
	}
}

public class TheradTable {
   public static void main(String[] args) {
	Table table = new Table();
	A1 a = new A1(table);
	a.start();
	B1 b1 = new B1(table);
	b1.start();
	C c = new C(table);
	c.start();
	
	
}
}
