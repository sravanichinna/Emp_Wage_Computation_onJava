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
		int absent=0;
		int wagePerHour=20;
		int fullTimeHour=8;
		int partTimeHour=4;
		int dailyEmpWage=0;
		if(randomNum==fullTimePresent)
		{
			System.out.println("employee is present full time: "+randomNum);
			dailyEmpWage=fullTimeHour*wagePerHour;
			System.out.println("Daily emp wage: "+dailyEmpWage);
		}
		else if(randomNum==partTimePresent)
                {
                        System.out.println("employee is present half time: "+randomNum);
                        dailyEmpWage=partTimeHour*wagePerHour;
                        System.out.println("Daily emp wage: "+dailyEmpWage);
                }
		 else
                {
                        System.out.println("employee is absent: "+randomNum);
                        dailyEmpWage=absent*wagePerHour;
                        System.out.println("Daily emp wage: "+dailyEmpWage);
                }
	}
}

