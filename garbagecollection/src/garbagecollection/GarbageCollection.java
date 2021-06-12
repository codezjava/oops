package garbagecollection;

public class GarbageCollection {

	String name;

	GarbageCollection(String name) {
		this.name = name;
	}

	protected void finalize() throws Throwable {
		System.out.println(this.name + "free the memory space");
	}

	public static void main(String arg[]) {
		GarbageCollection ga = new GarbageCollection("viji");
		ga = null;
		System.out.println("the object \"ga\" value is= " + ga);

		Runtime rs = Runtime.getRuntime();
		System.out.println("total memory space= " + rs.totalMemory());
		System.out.println("free memory space in before garbage collection= " + rs.freeMemory());
		rs.gc();
		System.out.println("free memory space in after garbage collection= " + rs.freeMemory());

		GarbageCollection g1 = new GarbageCollection("viji");
		GarbageCollection g2 = new GarbageCollection("rani");
		g1 = g2;
		System.gc();
		

	}

}
