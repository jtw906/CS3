import java.io.*;
import java.util.Scanner;
public class SocialSum {
	public static void main(String[] args){
		try (BufferedReader bReader = new BufferedReader(new FileReader("C:\\Users\\warham_905444\\eclipse-workspace\\CS3\\bin\\social.dat"));){
		System.out.println("Sum = " + sum(bReader.readLine()));
		System.out.println("Sum = " + sum(bReader.readLine()));
		}
		catch (FileNotFoundException e) {
			System.out.println("No file found");
		}
		catch(IOException e) {
			System.out.println("Something went wrong");
		}			
	}
	public static int sum(String nums) {
		int sum = 0;
		Scanner input = new Scanner(nums);
		input.useDelimiter("-");
        while(input.hasNextInt())
            sum += input.nextInt();
        input.close();
        return sum;
	}
}
