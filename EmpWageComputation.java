import java.util.Random;
public class EmpWageComputation{
	public static void main(String args[]) 
	{
	System.out.println("Welcome to employee wage computation");
	Random random=new Random();
                int randomNum=random.nextInt(2);
                System.out.println("Random number: "+randomNum);
                int fullTimePresent=2;
                int partTimePresent=1;
		int noOfDaysInMonth=20;
		int empRatePerHr=20;
		int empHrs=0;
		int empWage=0;
		int empWageForMonth=0;
		for(int day=1;day<=noOfDaysInMonth;day++)
		{
		switch(randomNum)
		{
		case partTimePresent:
			System.out.println("part time ");
			empHrs=4;
			break;
		case fullTimePresent:
			System.out.println("fyll time ");
			empHrs=8;
			break;
		default
			System.out.println("employee is absent ");
			empHrs=0;
		}
		empWage=(empHrs * empRatePerHr);
		empWageForMonth=(empWageForMonth+empWage);
		System.out.println("employee wage for day" + day + ":"+empWage);
		}
		System.out.println("employee wage of month is: "+empWageForMonth);

	}
}

