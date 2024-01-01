import java.util.Scanner;

public class studentGradeCalculator
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter number of subjects: ");
		int numOfSubj = scan.nextInt();
		
		int[] marks = new int[numOfSubj] ;
		int totMarks = 0;
		double average = 0;
		// populate
		for(int i = 0 ; i < numOfSubj ; i++)
		{
			
			System.out.println("Enter mark: " + (i+1));
			marks[i] = scan.nextInt();
			if(marks[i] <0 || marks[i] > 100)
				i--;
		}
		//sum
		for(int i = 0 ; i < numOfSubj ; i++)
		{
			totMarks += marks[i];
		}
		
		average = totMarks/ numOfSubj;
		
		System.out.println(" \nResults");
		for(int i = 0 ; i < numOfSubj ; i++)
		{
			
			if(marks[i] < 50 )
				System.out.println("Subject " + (i+1) +" "+ marks[i] + "% Failed");
			else if(marks[i] < 75 )
				System.out.println("Subject " + (i+1) +" "+ marks[i] + "% Passed");
			else
				System.out.println("Subject " + (i+1) +" "+ marks[i] + "% Distinction");
		}
		System.out.println("Total marks: " +totMarks+ "\nAverage " + average + "%\t\t");
		
	}
}