package MyProject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
	public void sort() {

		try {
			BufferedReader reader = new BufferedReader(new FileReader("url.txt"));
			List<String> str = new ArrayList<>();
			String line = "";
			while ((line = reader.readLine()) != null) {
				str.add(line);
			}
			reader.close();
			//Collections.sort(str);
			Collections.reverse(str);
			FileWriter writer = new FileWriter("url.txt");
			for (String s : str) {
				writer.write(s);
				writer.write("\r\n");
			}
			writer.close();
			System.out.println("Successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

