package org.abstractclass;

public class Rectangle extends Abstrct {
	private float width, height;
	public Rectangle() {
		this.width=5.0f;
		this.height=2.0f;
	}
	public Rectangle (float width, float height) {
		this.width=width;
		this.height=height;
		
	}
	@Override
	void Area() {
		area=width*height;

	}

}


