import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		try(BufferedReader bReader = new BufferedReader(new FileReader("C:\\Users\\warham_905444\\eclipse-workspace\\CS3\\bin\\average.dat"))){
			int lines = Integer.parseInt(bReader.readLine());
			for(int i = 0; i < lines; i++) {
				String input = bReader.readLine();
				System.out.println(findavg(input));
			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}
	public static double findavg(String nums) {
		int low = Integer.MAX_VALUE;
		Scanner input = new Scanner(nums);
		int sum = 0;
		int num=-1;
		int pull = 0;
        while(input.hasNextInt()) {
        	pull = input.nextInt();
        	if(pull<low) {
        		low = pull;
        	}
            sum += pull;
            num++;
        }
        sum-=low;
        double avg = (double)(sum)/num;
        input.close();
        return avg;
	}
}
