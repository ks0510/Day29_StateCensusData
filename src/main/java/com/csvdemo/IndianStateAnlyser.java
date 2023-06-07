package com.csvdemo;

/**
 * 
 * @author Kaif
 *
 */
public class IndianStateAnlyser {
	

	public boolean countData1(int count) {
		if(count==33) {
			return true;
		}
		return false;
	}
	
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Kaif\\Documents\\list_of_states_in_india.csv";
        CSVStateCensus csvStateCensus = new CSVStateCensus(filePath);
        int count=0;

        for (String[] data : csvStateCensus) {
        	count++;
            // Process each row of data
            // Example: Print the values of each column
            for (String value : data) {
                System.out.print(value + "   ");
            }
            System.out.println();
        }
    }
}