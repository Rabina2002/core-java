package OOP;

public class overloadingDemo2 { // count changing in method overloading
	static void test() {
		System.out.println("test method with no argument");
	}
	static void test(int a) {
		System.out.println("test method with 1 argument");
	}
	static void test(int a,int b) {
		System.out.println("test method with 2 argument");
	}
	 public static void main(String[] args) {
		 test();
		 test(10);
		 test(6,6);
		 
	 }
	 
}
