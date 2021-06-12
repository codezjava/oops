package abstractclass;

abstract class Pkit {
	void display() {
		System.out.println("pkit");
	}

	abstract void details();
}

class Abstractclass extends Pkit {
	 void details() {
		System.out.println("Wptc");
		
	}
	public static void main(String arg[])
	{
		 Abstractclass a=new  Abstractclass();
		 a.details();
		 a.display();
	}
}
