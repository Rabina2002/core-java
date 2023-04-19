package OOP;

public class overloading2 {

	public static void main(String[] args) {
		 {
			System.out.println(overloadingDemo.max(5,7));//calling here without object means we need to call it by static keyword in m
			System.out.println(max(5.5,6.6));//we cant pass doubloe value in int method it shows error,,but we can create the same method name and change the int into double then it works
			System.out.println(max('p','c'));//ASCII value priority
			System.out.println(Math.abs(-4.5));
			System.out.println(Math.abs(10));

	}

}
