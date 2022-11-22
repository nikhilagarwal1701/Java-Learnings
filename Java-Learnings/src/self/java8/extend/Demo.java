package self.java8.extend;

interface Phone {
	default void defautShow() {
		System.out.println("Default Show");
	}
	static void staticShow() {
		System.out.println("Static Show");
	}
	
	void brand();
}


//We are using this class just so we can use Phone Brand function
class AndroidPhone implements Phone {
	public void brand() {
		System.out.println("From useless class AndroidPhone");
	}
}

public class Demo {
	public static void main(String[] args) {
		Phone phone = new AndroidPhone();
		Phone.staticShow();
		phone.defautShow();
		
//		Useless use OfDouble AndroidPhone class
		phone.brand();
		
		//Use this Java 8 inner class instead
		Phone phone2 = new Phone() {
			public void brand() {
				System.out.println("Java 8 Brand");
			}
		};
		phone2.brand();
		
		
	}
}
