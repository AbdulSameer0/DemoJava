package AbstractClass;

abstract class CarCompany {
	public abstract boolean  checking();
}

class CarCampany2 extends CarCompany{

	@Override
	public boolean checking() {
		String f = "aa";
		String b = "aa";
		
		if(f==b) {
			return true;
		}
		else {
			return false;
		}
	}

	
	
}

public class Car {

	public static void main(String[] args) {
       CarCampany2 campany2 =  new CarCampany2();
       campany2.checking();
	}
}
