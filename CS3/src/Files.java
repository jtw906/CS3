import java.io.*;
public class Files {
	public static void main(String[] args) throws IOException{
		try (BufferedReader bReader = new BufferedReader(new FileReader("average.dat")); PrintWriter pWriter = new PrintWriter(new FileWriter("testOutput.dat"));){
		pWriter.println(bReader.readLine());
		}
		catch (FileNotFoundException e) {
			System.out.println("No file found");
		}
		catch(IOException e) {
			System.out.println("Something went wrong");
		}			
	}
}
