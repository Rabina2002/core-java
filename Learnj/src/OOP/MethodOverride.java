package OOP;
public class MethodOverride{
	public static void main(String[] args) {
		RBI rbi=new SBI();
		System.out.println(rbi.getRateOfInterest());
	    rbi=new HDFC();
		System.out.println(rbi.getRateOfInterest());
		rbi=new ICICI();
		System.out.println(rbi.getRateOfInterest());
		 
	}
	}


