package Assessment_Phase_1;
import java.io.*;
import java.util.*;

public class Operations {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	void ListDirectory(File dir) throws IOException {
		try {
			if (dir.isDirectory()) {
				File files[] = dir.listFiles();
				Arrays.sort(files);
				for (File file : files) {
					if (file.isDirectory()) {
						System.out.println("Directory: " + file.getName());
						ListDirectory(file);
					} else {
						System.out.println(" \t File: " + file.getName());
					}
					System.out.println(file);
				}
			}
		} catch (Exception e) {
			System.out.println("Error occured: " + e);
		}
	}
	
	public void Add() throws IOException {
		try {
			boolean success = false;
			System.out.println("Enter the file name to add: ");
			String filename = br.readLine();
			File f = new File(filename); 
			if (f.exists()) { 
				System.out.println("File already exists.");
			} else {
				System.out.println("No such file exists, adding now.");
				success = f.createNewFile();
				if (success) {
					System.out.println("Successfully added a file: "+f);
				} else {
					System.out.println("Failed to add a file: "+f);
				}
			}
		} catch (Exception e) {
			System.out.println("Error occured: " + e);
		}
	}
	
	public void Delete() throws IOException {
		try {
			System.out.println("Enter the file name to delete: ");
			String filename = br.readLine();
			File f = new File(filename); 
			if(f.delete()) 
			{ 
			    System.out.println("Successfully deleted a file: " + filename); 
			} 
			else
			{ 
			    System.out.println("Failed to delete a file: " + filename); 
			}
		} catch (Exception e) {
			System.out.println("Error occured: " + e);
		} 	
	}
	
	public void Search() throws IOException
	{
		try {
			System.out.println("Enter the file name to search: ");
			String filename = br.readLine();
			File dir = new File(".");
			List<String> files = Arrays.asList(dir.list());
			int found = 0;
			if (files == null) { 
			    System.out.println("Empty directory."); 
			} 
			else {
				for (String file : files) {
					if (file.equalsIgnoreCase(filename)) {
						System.out.println("Successfully searched a file: " + filename);
						found = 1;
					}
			    } 
			} 
  
			if (found == 0) { 
			    System.out.println("File Not Found: " + filename); 
			}
		} catch (Exception e) {
			System.out.println("Error occured: " + e);
		} 
	}
}