package pkgTestShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

	@Test
	public void SortByAreaTest() {
		try {
			ArrayList<Cuboid> cuboidArray = new ArrayList<Cuboid>();
			Cuboid c1 = new Cuboid(1,1,1);
			Cuboid c2 = new Cuboid(1,1,3);
			Cuboid c3 = new Cuboid(1,1,5);
			Cuboid c4 = new Cuboid(1,1,4);
			Cuboid c5 = new Cuboid(1,1,2);
			cuboidArray.add(c1);
			cuboidArray.add(c2);
			cuboidArray.add(c3);
			cuboidArray.add(c4);
			cuboidArray.add(c5);
			Cuboid c = new Cuboid();
			
			ArrayList<Cuboid> expectArray = new ArrayList<Cuboid>();
			
			expectArray.add(c1);
			expectArray.add(c5);
			expectArray.add(c2);
			expectArray.add(c4);
			expectArray.add(c3);
			
			Collections.sort(cuboidArray, c.new SortByArea());
			
			assertEquals(cuboidArray,expectArray);
		}catch(Exception e) {
			fail("Failed to Creat Cuboid");
		}
	}
	
	@Test
	public void SortByVolumeTest() {
		try {
			ArrayList<Cuboid> cuboidArray = new ArrayList<Cuboid>();
			Cuboid c1 = new Cuboid(2,2,2);
			Cuboid c2 = new Cuboid(1,1,3);
			Cuboid c3 = new Cuboid(3,3,3);
			Cuboid c4 = new Cuboid(1,1,4);
			Cuboid c5 = new Cuboid(1,1,2);
			cuboidArray.add(c1);
			cuboidArray.add(c2);
			cuboidArray.add(c3);
			cuboidArray.add(c4);
			cuboidArray.add(c5);
			Cuboid c = new Cuboid();
			
			ArrayList<Cuboid> expectArray = new ArrayList<Cuboid>();
			
			expectArray.add(c5);
			expectArray.add(c2);
			expectArray.add(c4);
			expectArray.add(c1);
			expectArray.add(c3);
			
			Collections.sort(cuboidArray, c.new SortByVolume());
			
			assertEquals(cuboidArray,expectArray);
		}catch(Exception e) {
			fail("Failed to Creat Cuboid");
		}
	}
	
}
