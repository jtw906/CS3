import java.io.*;

public class Boxes {

	public static void main(String[] args) {
		try(BufferedReader bReader = new BufferedReader(new FileReader("C:\\Users\\warham_905444\\eclipse-workspace\\CS3\\bin\\box.dat"))){
			int lines = Integer.parseInt(bReader.readLine());
			for(int i = 0; i < lines; i++) {
				String input = bReader.readLine();
				System.out.println(makeBox(input.substring(0, 1),Integer.parseInt(input.substring(2, 3))));
			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}
	public static String makeBox(String l, int rc) {
		String box = "";
		for(int i = 0;i<rc;i++) {
			for(int j = 0;j<rc;j++) {
				box+=l;
			}
			box+="\n";
		}
		return box;
	}
}
