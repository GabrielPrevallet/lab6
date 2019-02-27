
public class Square extends Rectangle
{
	public Square (String id,double size)
	{
		super(id, size/4.0, size/4.0);
		sideLengths.add(size/4);
		sideLengths.add(size/4);
		sideLengths.add(size/4);
		sideLengths.add(size/4);
	}
	public String getShapeType()
	{
		return "Square";
	}
}
