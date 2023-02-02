
class Shape
{
	void se()
	{
		System.out.println("there are different types of Shapes");
	}	
	}

class Circle extends Shape
{
	int r=4;
	double pi=3.14,area;
	
	public void getArea()
	{
		area=pi*r*r;
	System.out.println("Area of Circle is="+area);
		
	}
	public void getShape()
	{
		System.out.println("circles are tangent,concentric,congruent");	
		
	}
}


class Square  extends Circle
{
	int side=4,area;
	public void getArea()
	{
	area=side*side;
	System.out.println("Area of square="+area);
		
		
	}
	public void getShape()
	{
	System.out.println("different types of square shape is =rombus,parallelogram,quadrilateral");	
	}
}
public class Que2 {

	public static void main(String[] args) {
		
		Shape f=new Shape();
		f.se();
		Square s=new Square();
		Circle c=new Circle();
		c.getArea();
		c.getShape();
		s.getArea();
		s.getShape();
		
	}

}
