package annotation;

class Annotation1 {

	public void display() {
		System.out.println("I am an animal");
	}

	public static void main(String args[]) {
		Annotation1 d = new Annotation1();
		d.display();
	}
}

class Dog extends Annotation1 {
	@Override
	public void display() {
		System.out.println("i am a dog");
	}
}
