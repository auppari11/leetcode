
public class TriangleApp {
	
	public String isTriangle(int[] arr)
	{
		if(arr.length!=3) return "please enter three numbers";
		if(arr[0]+arr[1]+arr[2]<3 || arr[0]<0 || arr[1]<0 || arr[2]<0) 
			return "sum of all these values should be atleast 3";
		if(arr[0]==arr[1] && arr[1]==arr[2])
		{
			return "As all sides are equal it is an equilateral triangle";
		}else 
		{
			String val="N";
			val=isPropertySatisfied(arr);
			if (val=="Y")
			{
			if(arr[0]==arr[1] || arr[1]==arr[2] || arr[2]==arr[0])
			{
				return "As two sides are equal.This is Isosceles triangle";
			}
			else
			{
				return "All sides are unique.This is Scalene triangle";
			}
			}
			else 
				return val;
		}
	}
	public String isPropertySatisfied(int[] arr)
	{
		String retval=null;
		if(arr[0]+arr[1]>arr[2] && arr[1]+arr[2]>arr[0] && arr[2]+arr[0]>arr[1])
		{
			retval= "Y";
		}
		else
		{
			retval="Sum of the two numbers should be greater than third number";
			return retval;
		}
		if(arr[0]-arr[1]<arr[2] && arr[1]-arr[2]<arr[0] && arr[2]-arr[0]<arr[1])
		{
			retval= "Y";
		}
		else
		{
			retval="difference between two numbers should be less than third number";
			return retval;
		}
		return retval;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleApp ta=new TriangleApp();
		int[] arr= {3,4};
		String msg=ta.isTriangle(arr);
		System.out.println(msg);
      
	}

}
