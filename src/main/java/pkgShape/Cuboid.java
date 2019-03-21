package pkgShape;

public class Cuboid extends Rectangle{

	private int iDepth;

	public Cuboid(int iLength, int iWidth, int iDepth) throws Exception{
		super(iLength,iWidth);
		if (iDepth<0){
			throw new IllegalArgumentException("Negative Value");
		 }
		else {
			this.iDepth = iDepth;
		}
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return getiLength()*getiWidth()*iDepth;
	}
	
	@Override
	public double area() {
		return (2*getiLength()*getiWidth())+(2*getiLength()*iDepth)+(2*getiWidth()*iDepth);
	}
	
	/*public int compareTo(Object)*/
}
