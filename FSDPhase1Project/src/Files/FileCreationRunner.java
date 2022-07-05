package Files;

import java.io.File;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FileCreationRunner {

	Path path;
	
	//method for creating the file directory
	public void createDirectory()
	{
		
		this.path = Paths.get("./resources/Userfiles");//...>specifiying the path
		try {
			Files.createDirectories(path); //...creates the directory using the path which we specified
		    System.out.println("Directory is created!");
		}
		catch(IOException e)
		{
			System.err.println("Failed to create directory!");
		
	}
		//return path
}
	public Path getDirectoryPath() {
		return this.path;
	}
	public void createFile() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter User file name which you want to create");//..>user will entered the file name
		
		String fileName = sc.next();
		
		Path newFilePath = Paths.get(this.path + "/" + fileName); //...>/resources/userfile path
		
		try {
			Files.createFile(newFilePath); //method for create new file
			
			System.out.println("File created Successfully");
		}
		catch(FileAlreadyExistsException e) {
			System.out.println("File already exists!!! Enter new File name");//if the file already exist then throw an exeption
			this.createFile();
		}
		catch (IOException e) {
			 System.err.println("Failed to create file!" + e.getMessage());
			 
		}
			}
	//list all files
	public void listAllFiles() { //...method...return list of file
		
		String dir = this.path.toString();//...converts the path into string
		File[] listOfFiles = new File(dir).listFiles();//...it will return an array
		
		for(File file : listOfFiles) {
			if(file.isDirectory()) {
				
				System.out.println(file.getName());//...return name of the file
				}
			else if(file.isFile()) {
				System.out.println(file.getName());
			}
		}
	}
	// delete files
	public void deleteFile() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name you want to delete");
		String fileToDelete = sc.next();
		
		try {
			Files.delete(Paths.get(this.path + "/" + fileToDelete));
			System.out.println("File deleted successfully");
			}
		catch(NoSuchFileException e) {
			System.out.println("No such file exists!!! Enter new file name");
			}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	//print the files in the ascending order
	public void listAllFilesAscending() {
		String dir = this.path.toString();//create new file onj...providing the path
		File[] listOfFiles = new File(dir).listFiles();//...array
		
		List<File> listFile = Arrays.asList(listOfFiles);//...converted array into arraylist
		
		Collections.sort(listFile);//....sort method...sorting all files in ascending order
		
		Iterator<File> it = listFile.iterator();
		
		while(it.hasNext() ) {
			System.out.println(it.next().getName());//returns the name of that file
		}
	}
	//...search a file
	public void searchFile() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name you want to search");
		String fileToSearch = sc.next();
		
		Path path = Paths.get(this.path + "/" + fileToSearch);
		
		//check exists for file and directory
		if(Files.exists(path)) {
			
			if(Files.isRegularFile(path))
			{
				System.out.println("File exists!");
			}
			 if (Files.isDirectory(path)) 
			 {
	                System.out.println("File exists, but it is a directory.");
	            } 
	        } 
		       else {
	            System.out.println("File doesn't exist");
			
		}
	}
	
}
