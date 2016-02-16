package casestudy;

import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileWriter;
import java.io.PrintWriter;

import java.io.IOException;

public class Main {
	public static void main (String[] args) throws IOException {
		
		// READ
		
		FileReader fr = new FileReader("nomefile.csv");
		
		BufferedReader br = new BufferedReader(fr);
		
		String row = br.readLine();
		// Read line until null
		
		String[] items = row.split(row, ';');
		
		// WRITE
		
		FileWriter fw = new FileWriter("nomefineout.csv");
		
		PrintWriter pw = new PrintWriter(fw);
		
		// Write untile there is data
		pw.println();
	}
}
