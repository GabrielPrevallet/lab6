import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		Shape shape = new EquilateralTriangle("f", 3.0);
		Assert.assertEquals("Shape toString incorrect.", "<<EquilateralTriangle>>	 ID = <<f>>	 area = <<3.897>>	 perimeter = <<9.000>>", shape.toString());
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		Shape shape = new EquilateralTriangle("f", 3.0);
		Assert.assertEquals("Shape toString incorrect.", "<<EquilateralTriangle>>	 ID = <<f>>	 area = <<3.897>>	 perimeter = <<9.000>>", shape.toString());
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		Shape shape = new EquilateralTriangle("f", 3.0);
		Assert.assertEquals("Shape toString incorrect.", "<<EquilateralTriangle>>	 ID = <<f>>	 area = <<3.897>>	 perimeter = <<9.000>>", shape.toString());
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		Shape shape = new EquilateralTriangle("f", 3.0);
		Assert.assertEquals("Shape toString incorrect.", "<<EquilateralTriangle>>	 ID = <<f>>	 area = <<3.897>>	 perimeter = <<9.000>>", shape.toString());
	}
}
