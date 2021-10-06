package MyProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search {

	public void search(String searchStr) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("url.txt"));
		while (scan.hasNext()) {
			String line = scan.nextLine().toLowerCase().toString();
			if (line.contains(searchStr)) {
				System.out.println(line);
			}
			else{
				System.out.println("NOt Found");
			}
		}
	}

}

