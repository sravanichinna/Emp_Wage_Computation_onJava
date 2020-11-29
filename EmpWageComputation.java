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
		switch(randomNum)
		{
		case 1:
			int partTimeWage=(partTimeHour*wagePerHour);
			System.out.println("part time employee: "+partTimeWage);
				break;
		case 2:
			int fullTimeWage=(fullTimeHour*wagePerHour);
			System.out.println("full time employee: "+fullTimeWage);
				break;
		default:
			System.out.println("Absent: "+absent);
		}
	}
}

