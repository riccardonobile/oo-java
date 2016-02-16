package nobile.riccardo.letturascrittura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
			try {
				FileWriter fw = new FileWriter("testo.txt");
				PrintWriter pw = new PrintWriter(fw);
				pw.println("Ciao stronzo");
				pw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				FileReader fr = new FileReader("testo.txt");
				BufferedReader br = new BufferedReader(fr);
				String line = br.readLine();
				System.out.println(line);
				br.close();
				fr.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
}
