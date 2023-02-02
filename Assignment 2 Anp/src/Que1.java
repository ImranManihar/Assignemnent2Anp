import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Que1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int ob=sc.nextInt();
				List<Integer> num=new ArrayList();
	   num.add(sc.nextInt());
	   num.add(sc.nextInt());
	   num.add(sc.nextInt());
	   num.add(sc.nextInt());
	   num.forEach(s1->{if(s1%2!=0)
	  System.out.println("this is all odd number"+s1);});
	   }
	}


