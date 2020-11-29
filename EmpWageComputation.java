
import java.util.Random;
public class EmpWageComputation{
	public static void main(String args[]) 
	{
	System.out.println("Welcome to employee wage computation");
	Random random=new Random();
                int randomNum=random.nextInt(2);
                System.out.println("Random number: "+randomNum);
                int isPresent=1;
                if(randomNum==isPresent)
                {
                       System.out.println("employee is present");
            		int empHrs=8;
                        int ratePerHour=20;
                        System.out.println("salary== "+(empHrs*ratePerHour));
                }
                else
                {
                        System.out.println("employee is absent");
                        System.out.println("salary==0");
                }
	}
}

