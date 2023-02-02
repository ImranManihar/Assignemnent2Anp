import java.util.*;

class Que3
{
	public static int calculate(int unit)
	{
		if(unit<=100)
		{
			return unit*10 ;
		}
		else if(unit<=200)
		{
			return (100*10)+(unit-100)*15;
		}
		else if(unit<=300)
		{
			return (100*10)+(100*15)+(unit-200)*20;
		}
		else if(unit>300)
		{
			return (100*10)+(100*15)*(100*20)+(unit-300)*25;
		}
		return 0;
		
	}


public static void main(String[] args) {
		
		int unit=250;
		
		System.out.println(calculate(unit));
		
		
	
	}
}



