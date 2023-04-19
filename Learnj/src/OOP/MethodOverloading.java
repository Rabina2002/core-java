package OOP;

public class MethodOverloading {
	public static int add(int a,int b) {//for static should give return type 
		return a+b;
	}
	public static int add(int a) {//for static should give return type 
		return a;
	}
	public static float add(int a,float b) {//for static should give return type 
		return a+b;
	}
	public static float add(float a,int b) {//for static should give return type 
		return a+b;
	}
	public static float add(float a,float b) {//for static should give return type 
		return a+b;
	}
	public static String add(String a,String b) {//for static should give return type 
		return a+b;
	}
}
