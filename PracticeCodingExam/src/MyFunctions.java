import java.util.ArrayList;
import java.util.HashMap;

public class MyFunctions {

	public static double findBiggest(ArrayList<Double> numbers) {

		Double bigNum = -99999.0;
		// for (int j = 0; j < numbers.size(); j++) {

		for (Double a : numbers) {

			/*
			 * if (numbers.get(j) > bigNum) {
			 * 
			 * bigNum = numbers.get(j);
			 * 
			 * }
			 */

			if (a > bigNum) {

				bigNum = a;

			}
			

			// TODO Auto-generated method stub

		}
		return bigNum;
	}

	public static String findPoorest(HashMap<String, Integer> bankAccounts) {

		int number = 999999999;

		String saveName = "a";

		for (String name : bankAccounts.keySet()) {
			//(1)keySet(2)values

			if (bankAccounts.get(name) <= number) {

				saveName = name;
				number = bankAccounts.get(name);

			}

		}
		return saveName;

	}
}
