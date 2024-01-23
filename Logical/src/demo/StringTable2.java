package demo;
class A extends Thread{
	StringDemo demo;
	public A(StringDemo demo) {
		this.demo=demo;
	}
	@Override
	public void run() {
		demo.table(2);
	}
}
class B extends Thread {
	StringDemo demo;
	public B( StringDemo demo) {
		this.demo=demo;
	}
	@Override
	public void run() {
		demo.table(5);
	}
}
class C3 extends Thread{
	StringDemo demo;
	public C3(StringDemo demo) {
		this.demo=demo;
	}
	@Override
	public void run() {
		demo.table(6);
	}
}
public class StringTable2 {
  public static void main(String[] args) {
	StringDemo demo = new StringDemo();
	A a = new A(demo);
	B b = new B(demo);
	C3 c = new C3(demo);
	a.start();
	b.start();
	c.start();
}
}
