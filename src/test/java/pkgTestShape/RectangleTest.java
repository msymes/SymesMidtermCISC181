package pkgTestShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
import pkgShape.Rectangle;
import org.junit.Test;

public class RectangleTest {

	@Test
	public void RectangleTest1() {
		try {
			Rectangle r = new Rectangle(2,3);
		} catch (Exception e) {
			fail("Failed to create rectangle: Length and Width must be positive");
		}
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void RectangleTest2() throws Exception{
		Rectangle r = new Rectangle(-1,3);
	}
	
	@Test
	public void getiWidthTest1(){
		try {
			Rectangle r = new Rectangle(2,3);
			int width = r.getiWidth();
			int widthExpect = 3;
			assertEquals(width,widthExpect);
		} catch (Exception e) {
			fail("Failed to create rectangle: Length and Width must be positive");
		}
	}
	
	@Test
	public void getiLengthTest() {
		try {
			Rectangle r = new Rectangle(2,3);
			int length = r.getiLength();
			int lengthExpect = 2;
			assertEquals(length,lengthExpect);
		} catch (Exception e) {
			fail("Failed to create rectangle: Length and Width must be positive");
		}
	}
	
	@Test
	public void setiWidthTest1() {
		try {
			Rectangle r = new Rectangle();
			r.setiWidth(3);
			int width = r.getiWidth();
			int widthExpect = 3;
			assertEquals(width,widthExpect);
		} catch (Exception e) {
			fail("Failed to create rectangle: Length and Width must be positive");
		}
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void setiWidthTest2() throws Exception{
			Rectangle r = new Rectangle();
			r.setiWidth(-3);
	}
	
	@Test
	public void setiLengthTest1() {
		try {
			Rectangle r = new Rectangle();
			r.setiLength(2);
			int length = r.getiLength();
			int lengthExpect = 2;
			assertEquals(length,lengthExpect);
		} catch (Exception e) {
			fail("Failed to create rectangle: Length and Width must be positive");
		}
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void setiLengthTest2() throws Exception {
			Rectangle r = new Rectangle();
			r.setiLength(-2);
	}
	
	@Test
	public void areaTest1() {
		try {
			Rectangle r = new Rectangle(2,3);
			double area = r.area();
			double areaExpect = 6;
			assertEquals(area,areaExpect,0);
		} catch (Exception e) {
			fail("Failed to create rectangle: Length and Width must be positive");
		}
	}
	
	@Test
	public void areaTest2() {
		try {
			Rectangle r = new Rectangle(3,3);
			double area = r.area();
			double areaExpect = 9;
			assertEquals(area,areaExpect,0);
		} catch (Exception e) {
			fail("Failed to create rectangle: Length and Width must be positive");
		}
	}
	
	@Test
	public void perimeterTest1() {
		try {
			Rectangle r = new Rectangle (2,3);
			double perimeter = r.perimeter();
			double perimeterExpect = 10;
			assertEquals(perimeter,perimeterExpect,0);
		} catch (Exception e) {
				fail("Failed to create rectangle: Length and Width must be positive");
		}
	}
	
	@Test
	public void perimeterTest2() {
		try {
			Rectangle r = new Rectangle (3,3);
			double perimeter = r.perimeter();
			double perimeterExpect = 12;
			assertEquals(perimeter,perimeterExpect,0);
		} catch (Exception e) {
				fail("Failed to create rectangle: Length and Width must be positive");
		}
	}
	
	@Test
	public void compareToTest1() {
		try {
			Rectangle r1 = new Rectangle(4,6);
			Rectangle r2 = new Rectangle(2,2);
			assertEquals(r1.compareTo(r2),1);
			} catch (Exception e) {
				fail("Failed to create Rectangle");
			}
		}
	
	@Test 
	public void compareToTest2() {
		try {
			Rectangle r1 = new Rectangle(2,2);
			Rectangle r2 = new Rectangle(4,6);
			assertEquals(r1.compareTo(r2),-1);
			} catch (Exception e) {
				fail("Failed to create Rectangle");
			}
		}
}
