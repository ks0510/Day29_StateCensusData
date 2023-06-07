package com.csvdemo;

/**
 * 
 * @author Kaif
 *
 */



public class StateCensusAnlyser {
	
	public boolean countData(int count) {
		if(count==51) {
			return true;
		}
		return false;
	}
	
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Kaif\\Documents\\state_demographics.csv";
        CSVStateCensus csvStateCensus = new CSVStateCensus(filePath);
        int count =0;

        for (String[] data : csvStateCensus) {
        	count++;
            // Process each row of data
            // Example: Print the values of each column
            for (String value : data) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}