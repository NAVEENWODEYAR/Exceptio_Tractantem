package com.gowri.excptn;

/**
 * @author NaveenWodeyar
 * @date 19-Jan-2025 11:22:37 pm
 */

public class FileNotFoundExample {

	public static void readFile(String filename) {
		try {
			// Code that might throw an exception
			FileReader file = new FileReader(filename);
			BufferedReader fileInput = new BufferedReader(file);

			// Reading the file line by line
			String line;
			while ((line = fileInput.readLine()) != null) {
				System.out.println(line);
			}
			fileInput.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found");
		} catch (IOException e) {
			System.out.println("Error: Issue reading the file");
		} finally {
			System.out.println("Cleanup actions can be done here");
		}
	}

	public static void main(String[] args) {
		readFile("example.txt");
	}
}
