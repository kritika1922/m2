
import java.io.File;
import java.io.IOException;

import java.util.Scanner;
import MyProject.*;

class Assignment3 {
	public static void main(String args[]) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Whatever you want");
		System.out.println("Add\nDelete\nSearch");
		System.out.println("===============");
		String s = sc.nextLine();
		System.out.println("+++++++++++++");
		switch (s) {
		case "Add":
			System.out.println("Enter EmployeId,Name,Email,Age And Date of birth");
			String id = sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			String age = sc.nextLine();
			String date = sc.nextLine();
			Add a = new Add();
			a.add(id, name, email, age, date);
			break;
		case "Delete":
			System.out.println("Enter the String you wish to delete ");
			String lineToRemove = sc.nextLine();
			Delete d = new Delete();
			d.delete(lineToRemove);
			break;
		case "Search":
			System.out.println("Search String\nSort File\nWhich Direction");
			System.out.println("===============");
			String type = sc.nextLine();
			System.out.println("+++++++++++++");

			switch (type) {
			case "Search String":
				System.out.println("Enter the String you wish to search ");
				String se = sc.nextLine();
				Search sea = new Search();
				sea.search(se);
				break;
			 case "Sort File":
			 	Sort so=new Sort();
			 	so.sort();	
			}

		}
	}
}

