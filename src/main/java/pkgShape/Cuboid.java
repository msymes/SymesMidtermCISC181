package pkgShape;

import java.util.*; 
import java.lang.*; 
import java.io.*; 

public class Cuboid extends Rectangle{

	private int iDepth;

	public Cuboid() {
	}
	
	public Cuboid(int iLength, int iWidth, int iDepth) throws Exception{
		super(iLength,iWidth);
		if (iDepth>0){
			this.iDepth = iDepth;
		 }
		else {
			throw new IllegalArgumentException("Negative Value");
		}
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) throws Exception {
		if (iDepth>0) {
			this.iDepth = iDepth;
		}
		else {
			throw new IllegalArgumentException("Negative Value");
		}
	}
	
	public double volume() {
		return getiLength()*getiWidth()*iDepth;
	}
	
	@Override
	public double area() {
		return (2*getiLength()*getiWidth())+(2*getiLength()*iDepth)+(2*getiWidth()*iDepth);
	}
	
	@Override
	public double perimeter(){
		throw new UnsupportedOperationException("Cuboid cannot use Perimeter");
	}
	
	@Override
	public int compareTo(Object obj) {
		Cuboid c = (Cuboid) obj;
		return Double.compare(c.volume(), this.volume());
	}
	
	
	
	public class SortByArea implements Comparator<Cuboid>{
		
		protected SortByArea() {
		}
				
		public int compare(Cuboid cuboid1, Cuboid cuboid2) {
			return (int) (cuboid1.area() - cuboid2.area());
		}
		
	}
	
	
	
	public class SortByVolume implements Comparator<Cuboid>{
		
		protected SortByVolume(){	
		}
		
		public int compare(Cuboid cuboid1, Cuboid cuboid2) {
			return (int) (cuboid1.volume() - cuboid2.volume());
		}
	}
}
