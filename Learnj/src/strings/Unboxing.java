package strings;

public class Unboxing {

	public static void main(String[] args) {
		Integer a=new Integer(500);
		int n=a.intValue();
		System.out.println(a);
		System.out.println(n);
		int m=a;
		System.out.println(m);
		Character c=new Character('A');
		int b=c;
		System.out.println(b);
		
	}

}
