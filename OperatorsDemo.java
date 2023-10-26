package statements;

public class OperatorsDemo 
{

	public static void main(String[] args)
	{
	   int a=10;
	   int b=20;
	   int x=10;
	   System.out.println("a and b values before operation:"+a+" "+b);
	   ++a;
	   int c=++a +b +a--;
	   System.out.println("C values after operation:"+c);
	   int d=c++ +a +b--;
	   System.out.println("D values after operation:"+d);
	   System.out.println("a,b,c,d values after operations:"+a+" "+b+" "+c+" "+d);

	}

}
