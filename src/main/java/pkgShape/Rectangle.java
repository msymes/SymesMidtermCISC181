package pkgShape;

public class Rectangle extends Shape {

	private int iWidth;
	private int iLength;
	
	public Rectangle(int iLength, int iWidth) throws Exception{
		if(iWidth<0||iLength<0) {
			throw new IllegalArgumentException("Negative Value");
		}
		else {
			this.iWidth = iWidth;
			this.iLength = iLength;
		}
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public double area() {
		return iLength*iWidth;
	}
	
	public double perimeter() {
		return (2*iLength)+(2*iWidth);
	}
	
	/*public int compareTo(Object) {
		
	}*/
}
