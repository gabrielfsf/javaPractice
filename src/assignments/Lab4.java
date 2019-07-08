package assignments;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab4 {

	public static void main(String[] args) {
		
		String filename = "/Users/gabrielferraz/Documents/files/creditCardStatement.csv";
		List<String[]> data = new ArrayList<>();
		String dataRow;
		
		Double balance = 0.0;
		final Double feeRate = 0.1;
		final Double minFee = 2.5;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			while ((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				data.add(line);
				
				for (String field : line) {
					if (field.contains("CREDIT")) {
						balance += Double.valueOf(line[3]);
					}
					if (field.contains("DEBIT")) {
						balance -= Double.valueOf(line[3]);
					}
					if (field.contains("FEE")) {
						balance += Double.valueOf(line[3]);
					}
					
				}
				
				
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (balance > 0) {
			Double fee = balance * feeRate;
			if (fee < minFee) {
				System.out.println("The ending balance for this month was " + String.format("$%,.2f", balance) +
						".\nThe monthly fee charged to your account was " + String.format("$%,.2f", minFee));
				balance += minFee;
			} else {
				System.out.println("The ending balance for this month was " + String.format("$%,.2f", balance) +
						".\nThe monthly fee charged to your account was " + String.format("$%,.2f", fee));
				balance += fee;
				
			}
		} else if (balance == 0) {
			System.out.println("Thank you for your payments!");
		} else {
			System.out.println("Thank you for your payments!"
					+ "\nSince you overpaid your balance, you now have a remaining credit of " + String.format("$%,.2f", balance));
		}
		

	}

}
