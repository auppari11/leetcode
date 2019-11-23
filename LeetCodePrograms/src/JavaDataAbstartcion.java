abstract class shape{
	 static String color;
	abstract double area();
	public abstract String toString();
	public shape(String color)
	{
		System.out.println("in abstract constructor");
		this.color=color;
	}
	public String getColor()
	{
		return this.color;
	}
}
 class rectangle extends shape
{
	private int length;
	 int breadth;
	 static int val=2;
	public rectangle()
	{
		super(color);
		System.out.println("hi");
	}
	public rectangle(String color,int length,int breadth)
	{
		super(color);
		this.length=length;
		this.breadth=breadth;
	}
	double area()
	{
		return this.length*this.breadth;
	}
	public String toString()
	{
		return "rectangle color is "+getColor()+"and area "+area();
	}
	public int getlength()
	{
		return this.length;
	}
	public int setlength(int len)
	{
		return this.length=len;
	}
}
 class matchBox extends rectangle
 {
	 public matchBox(int val)
	 {
		 super();
		 System.out.println(super.val+" len "+super.setlength(9)+" area now "+super.area());
		 
	 }
 }
public class JavaDataAbstartcion  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s1=new rectangle("red", 4, 5);
		System.out.println(s1.toString());
		matchBox mb=new matchBox(5);

	}

}
