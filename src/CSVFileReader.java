import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader {
	public static void main(String args[]) {
		try {
			File f = new File("C:/Users/hirachi-takahiro/Desktop/CSVFile.csv");
			BufferedReader reader = new BufferedReader(new FileReader(f));
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません:" + e);
		} catch (IOException e) {
			System.out.println("I/Oエラーです:" + e);
		}
	}
}