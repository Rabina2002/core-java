package strings;

public class StringDemo {

	public static void main(String[] args) {
	 String s="hello";
	 char c[]= {'w','e','l','c','o','m','e'};
	 String s1=new String(c);
	 
	 String s2=new String("you all");
	 System.out.println(s+" "+s1+" "+s2);
	 System.out.println(s.charAt(4));
	 System.out.println(s1.length());
	 System.out.println(s2.toUpperCase());

	}

}
