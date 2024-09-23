abstract class Shape
{
	abstract void numberOfSides();
	
}
class Rectangle extends Shape
{
	int side;
	Rectangle(int side)
	{
		this.side = side;
	}
	public void numberOfSides()
	{
		System.out.println("Number of sides of rectangle = "+side);
	}
}
class Triangle extends Shape
{
	int side;
	Triangle(int side)
	{
		this.side = side;
	}
	public void numberOfSides()
	{
		System.out.println("Number of sides of triangle = "+side);
	}
}
class Hexagon extends Shape
{
	int side;
	Hexagon(int side)
	{
		this.side = side;
	}
	public void numberOfSides()
	{
		System.out.println("Number of sides of hexagon = "+side);
	}
}
public class AbstractExample
{

	public static void main(String[] args)
	{
		Rectangle re = new Rectangle(4);
		Triangle tr = new Triangle(3);
		Hexagon he = new Hexagon(6);
		re.numberOfSides();
		tr.numberOfSides();
		he.numberOfSides();
	}
}	

