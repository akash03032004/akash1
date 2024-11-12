package org.abstractclass;

public class Square extends Abstrct  {
	private float side;
	public Square() {
		side=2.0f;
		
	}
	public Square(float side) {
		this.side=side;
	}
	
	@Override
	void Area() {
		super.area=side*side;
		// TODO Auto-generated method stub
		
	}

}
