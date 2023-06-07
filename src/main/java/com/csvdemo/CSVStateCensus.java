package com.csvdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 
 * @author Kaif
 *
 */
public class CSVStateCensus implements Iterable<String[]> {
	private String filePath;

	public CSVStateCensus(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public Iterator<String[]> iterator() {
		return new CSVIterator();
	}

	private class CSVIterator implements Iterator<String[]> {
		private BufferedReader reader;
		private String currentLine;

		public CSVIterator() {
			try {
				reader = new BufferedReader(new FileReader(filePath));
				currentLine = reader.readLine(); // Skip header line
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public boolean hasNext() {
			try {
				return currentLine != null && reader.ready();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public String[] next() {
			String[] data = currentLine.split(",");
			try {
				currentLine = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				currentLine = null;
			}
			return data;
		}
	}
}
