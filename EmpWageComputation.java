import java.util.Random;
public class EmpWageComputation{
	public static void main(String args[]) 
	{
	System.out.println("Welcome to employee wage computation");
		int maxHrsInMonth=100;
		int noOfWorkDay=20;
		int empRatePerHr=20;
		int isPartTime=1;
		int isFullTime=2;
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkDay=0;
		int totalEmpWage=0;
	while( totalWorkDay<noOfWorkDay && totalEmpHrs<=maxHrsInMonth)
	{
		 Random random=new Random();
                int randomNum=random.nextInt(3);
                System.out.println("Random number: "+randomNum);
	switch(randomNum)
	{
	case isPartTime: empHrs=4;
		break;
	case isFullTime: empHrs=8;
		break;
	default; empHrs=0;
	}
		totalWorkDays++;
		totalEmpHrs=totalEmpHrs + empHrs;
		System.out.println("employee days: "+totalWorkDay + "work hours: "+totalEmpHrs);
	}
totalEmpWage=(toatalEmpHrs * empRatePerHour);
System.out.println("employee total salary is: "+totalEmpWage);



	}
}

