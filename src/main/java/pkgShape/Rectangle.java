package pkgShape;

import java.util.*; 
import java.lang.*; 
import java.io.*; 

public class Rectangle extends Shape {

	private int iWidth;
	private int iLength;
	
	public Rectangle() {
	}
	
	public Rectangle(int iLength, int iWidth) throws Exception{
		if(iWidth>0 && iLength>0) {
			this.iWidth = iWidth;
			this.iLength = iLength;
		}
		else {
			throw new IllegalArgumentException("Negative Value");
		}
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) throws Exception {
		if (iWidth>0) {
			this.iWidth = iWidth;
		}
		else {
			throw new IllegalArgumentException("Negative Value");
		}
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) throws Exception {
		if (iLength>0) {
			this.iLength = iLength;
		}
		else {
			throw new IllegalArgumentException("Negative Value");
		}
	}
	@Override
	public double area() {
		return iLength*iWidth;
	}
	
	@Override
	public double perimeter() {
		return (2*iLength)+(2*iWidth);
	}
	
	public int compareTo(Object obj) {
		Rectangle r = (Rectangle) obj;
		return Double.compare(this.area(),r.area());
	}
}
