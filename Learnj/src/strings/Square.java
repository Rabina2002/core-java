package strings;

public class Square extends Shape {
	float side;
	public Square() {
		side=2.0f;
	}
	public Square(float side) {
		this.side=side;
	}
	@Override
	void CalArea() {
		super.area=side*side;
		
	}
	

}
