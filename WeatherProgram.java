import java.util.Scanner;

public class WeatherProgram 
{

	public static void main(String[] args) {
		
		{
			System.out.println("Please input current temperature in Farenheit.");
		}
		
		Scanner cin = new Scanner(System.in);
		
		int temp = cin.nextInt();
		//int temp is user input
		double c = ((5*  (((double)temp - 32) / 9 )));
		
		//above converts Farenheit to Celcius
		
		if(temp>=90)
			
		{
			System.out.println("That's really hot!");
		}
		
		if(temp<=32)
			
		{
			System.out.println("That's really cold!");
		}
		
		{
				System.out.println("The tempature is " + c + " degrees Celsius. Have a nice day!");
		}
		
		cin.close();
		//closes the Scanner
	}

}
