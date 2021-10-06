package MyProject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Delete {
	public void delete(String lineToRemove) throws IOException {
		 
		File inputFile = new File("url.txt");
		File tempFile = new File("newFile.txt");
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		String currentLine;

		while ((currentLine = reader.readLine()) != null) {
			String trimmedLine = currentLine.trim();
			if (trimmedLine.startsWith(lineToRemove))
				continue;
			//System.out.println(trimmedLine);
			writer.write((currentLine) + System.getProperty("line.separator"));
		}
		writer.close();
		reader.close();
		Files.move(tempFile.toPath(), inputFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
	}

}

