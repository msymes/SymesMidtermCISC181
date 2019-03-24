package pkgShape;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Cuboid extends Rectangle {

	private int iDepth;

	public Cuboid() {
	}

	public Cuboid(int iLength, int iWidth, int iDepth) throws Exception {
		super(iLength, iWidth);
		if (iDepth > 0) {
			this.iDepth = iDepth;
		} else {
			throw new IllegalArgumentException("Negative Value");
		}
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) throws Exception {
		if (iDepth > 0) {
			this.iDepth = iDepth;
		} else {
			throw new IllegalArgumentException("Negative Value");
		}
	}

	public double volume() {
		return getiLength() * getiWidth() * iDepth;
	}

	@Override
	public double area() {
		return (2 * getiLength() * getiWidth()) + (2 * getiLength() * iDepth) + (2 * getiWidth() * iDepth);
	}

	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Cuboid cannot use Perimeter");
	}

	@Override
	public int compareTo(Object obj) {
		Cuboid c1 = (Cuboid) obj;
		return Double.compare(this.area(),c1.area());
	}

	public class SortByArea implements Comparator<Cuboid> {

		public int compare(Cuboid c1, Cuboid c2) {
			return c1.compareTo(c2);
		}
	}

	public class SortByVolume implements Comparator<Cuboid> {
		public SortByVolume() {
		}

		public int compare(Cuboid c1, Cuboid c2) {
			return Double.compare(c1.volume(), c2.volume());
		}
	}
}
