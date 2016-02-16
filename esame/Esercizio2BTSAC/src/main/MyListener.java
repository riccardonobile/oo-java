package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyListener implements PressureSensorListener{
	ArrayList<Double> dataList = new ArrayList<>();
	Map<Integer, Integer> errorMap = new HashMap<>();
	
	@Override
	public void onSuccess(double pressure) {
		dataList.add(pressure);
	}
	
	@Override
	public void onFailed(PressureSensorException exception) {
		if(!errorMap.containsKey(exception.getErrorcode())) {
			errorMap.put(exception.getErrorcode(), 1);
		} else {
			int errors = errorMap.get(exception.getErrorcode());
			errors++;
			errorMap.put(exception.getErrorcode(), errors);
		}
	}
	
	public ArrayList<Double> getData() {
		return dataList;
	}
	
	public Map<Integer, Integer> getErros() {
		return errorMap;
	}
	
	public double getMax() {
	    double max = Double.MIN_VALUE;
	    for(int i=0; i < dataList.size(); i++) {
	        if(dataList.get(i) > max){
	            max = dataList.get(i);
	        }
	    }
	    return max;
	}
	
	public long getAvg() {
		double tot = 0;
		for(int i=0; i < dataList.size(); i++) {
			tot += dataList.get(i);
		}
		return Math.round(tot / dataList.size());
	}
}
