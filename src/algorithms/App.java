package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	
	public void exercise1() {
		int[] numbers = {1, 2, 3, 3};
		int key = 0;
		int frequency = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int number : numbers) {
			map.put(number, map.containsKey(number) ? map.get(number).intValue() + 1 : 1);
		}
		
		for (Entry<Integer, Integer> x : map.entrySet()) {
			if (x.getValue() > frequency) {
				frequency = x.getValue();
				key = x.getKey();
			}
		}
 		
		System.out.println(key);
	}
	
	public void exercise2() {
		Integer numbers[] = {1, 2, 5};
		Integer copyNumbers[] = numbers;
		
		List<Integer> listNumbers = Arrays.asList(numbers);
		List<Integer> listCopyNumbers = Arrays.asList(copyNumbers);
		List<String> result = new ArrayList<String>();
		int totalSum = 10;
		
		for (int i = 0; i < listNumbers.size(); i++) {
			int number = listNumbers.get(i);
			for (int j = 0; j < listCopyNumbers.size(); j++) {
				int copy = listCopyNumbers.get(j);
				if (number + copy == totalSum && 
					number < totalSum && 
					copy < totalSum && 
					number > 0 && copy > 0 &&
					i != j) {
					result.add(number + " " + copy);
					listNumbers.set(i, 0);
					listCopyNumbers.set(j, 0);
				}
			}
		}
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	
	public void exercise3() {
		Integer numbers[] = {1, 1, 2, 5, 5, 3};
		int key = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer number : numbers) {
			map.put(number, map.containsKey(number) ? map.get(number).intValue() + 1 : 1);
		}
		
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				key = entry.getKey();
				break;
			}
		}
		
		System.out.println(key);
	}
	
	public static void main(String[] args) {
		App app = new App();
		//app.exercise1();
		//app.exercise2();
		app.exercise3();
	}
}
