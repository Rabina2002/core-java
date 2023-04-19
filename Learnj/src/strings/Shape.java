package strings;

public abstract class Shape {
	protected float area;
	abstract void CalArea();
	
	void show()
	{
		System.out.println("Area of shape: "+area);
	}

}
