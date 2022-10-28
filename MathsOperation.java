package Maths;
public class  MathsOperation{
        static int num1;
	static int num2;
	static int num3;
	public static void maximum(int num1, int num2, int num3){
		if(num1>=num2 && num1>=num3)
			System.out.println( num1+ "is the maximum number");
		else if(num2>=num1 && num2>=num3)
			System.out.println( num2+ "is the maximun number");
		 else
			 System.out.println( num3+ " is the maximum number");
	}
	public static void minimum(int num1, int num2, int num3){
		if(num1<=num2 && num1<=num3)
			System.out.println( num1+ "is the minimum number");
		else if(num2<=num1 && num2<=num3)
			System.out.println(num2+ "is the minimum number");
		else
			System.out.println(num3+ "is the minimum number");
	}
}

		



