
package MyProject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Add {
	public void add(String id, String name, String email, String age, String date) throws IOException {
		BufferedWriter output = null;
		try {
			List<List<String>> list1 = new ArrayList<List<String>>();
			List<String> list = new ArrayList<String>();
			list.add(id);
			list.add(name);
			list.add(email);
			list.add(age);
			list.add(date);
			System.out.println("lIST" + list);
			list1.add(list);

			File file = new File("url.txt");

			FileWriter g = new FileWriter(file, true);
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			output = new BufferedWriter(g);
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			for (List<String> rowData : list1) {
				output.append(String.join(",", rowData));
				output.append("\n");
				System.out.println("Successful Write");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (output != null) {
				output.close();
			}

		}
	}

}

