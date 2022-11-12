package aptitude;
import java.util.Scanner;

public class Lcm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int max=0;
		int no1;int no2;int no3;
		System.out.println("Enter first number");
		no1=s.nextInt();
		System.out.println("Enter first number");
		no2=s.nextInt();
		System.out.println("Enter first number");
		no3=s.nextInt();

        
		if((no1>no2) && (no1>no3))
		{
			max=no1;
		}
		else if((no2>no3)&& (no2>no1))
		{
			max=no2;
		}
		else
			max=no3;
		
		
		while(true)
		{
		     if((max%no1==0)&&(max%no2==0)&& (max%no3==0))
		      {
			    System.out.println("lcm= "+max);
			    break;
		       }
		max++;
		}
		
	}

}
