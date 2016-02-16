package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		PressureSensor ps = new PressureSensor();
		MyListener listener = new MyListener();

		ps.setListener(listener);
		
		for(int i = 0; i < 1000; i++) {
			ps.next();
		}
		
		Map<Integer, Integer> errorMap = new HashMap<>();
		ArrayList<Double> dataList = new ArrayList<>();
		
		dataList = listener.getData();
		errorMap = listener.getErros();
		
		dataList.forEach((Double data) -> {
			System.out.println(data);
		});
		System.out.println("Numero rilevazioni correttamente effettuate: " + dataList.size());
		System.out.println("Valore massimo: " + listener.getMax());
		System.out.println("Valore medio: " + listener.getAvg());
		errorMap.forEach((Integer errorCode, Integer errorNumber) -> {
			System.out.println("Errore " + errorCode + ": " + errorNumber);
		});
	}
}
