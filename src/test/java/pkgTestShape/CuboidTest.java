package pkgTestShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
import pkgShape.Cuboid;

public class CuboidTest {
	
	@Test
	public void CuboidTest1() {
		try {
			Cuboid c = new Cuboid(2,3,1);
		} catch (Exception e) {
			fail("Failed to create Cuboid");
		}
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void CuboidTest2() throws Exception{
		Cuboid c = new Cuboid(2,3,-1);
	}

	@Test
	public void getiDepthTest1() {
		try {
			Cuboid c = new Cuboid (2,3,1);
			int depth = c.getiDepth();
			int depthExpect = 1;
			assertEquals(depth,depthExpect);
		} catch (Exception e) {
			fail("Failed to create Cuboid");
		}
	}
	
	@Test 
	public void setiDepthTest1() {
		try {
			Cuboid c = new Cuboid();
			c.setiDepth(4);
			int depth = c.getiDepth();
			int depthExpect = 4;
			assertEquals(depth,depthExpect);
		} catch (Exception e) {
			fail("Failed to create Cuboid");
		}
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void setiDepthTest2() throws Exception{
			Cuboid c = new Cuboid();
			c.setiDepth(-4);
	}
	
	@Test
	public void areaTest1() {
		try {
			Cuboid c = new Cuboid(2,3,1);
			double area = c.area();
			double areaExpect = 22;
			assertEquals(area,areaExpect,0);
		} catch (Exception e) {
			fail("Failed to create Cuboid");
		}
	}
	
	@Test
	public void volumeTest() {
		try {
			Cuboid c = new Cuboid(2,3,1);
			double volume = c.volume();
			double volumeExpect = 6;
			assertEquals(volume,volumeExpect,0);
		} catch (Exception e) {
			fail("Failed to Creat Cuboid");
		}
	}
	
	@Test (expected = UnsupportedOperationException.class)
	public void perimeterTest() throws Exception {
		Cuboid c = new Cuboid(2,3,1);
		c.perimeter();
	}

	
	/*public void SortByAreaTest() {
		ArrayList<Cuboid> cuboidArray = new ArrayList<Cuboid>();
		cuboidArray.add(new Cuboid(1,1,1));
		cuboidArray.add(new Cuboid(1,1,3));
		cuboidArray.add(new Cuboid(1,1,5));
		cuboidArray.add(new Cuboid(1,1,4));
		cuboidArray.add(new Cuboid(1,1,2));
		
		Collections.sort(cuboidArray, new SortByArea());
	}
	
	@Test
	public void SortByVolumeTest() {
		
	}*/
}
