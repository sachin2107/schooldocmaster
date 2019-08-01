package com.demo.onesd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
//jxl-2.6 jar used
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		int noOfRows=7,noOfCols=4; //noOfRows=exactcount+1 & noOfCols=exact count
		Map<Integer, List<String>> excelMap = readExcel(noOfRows, noOfCols);
		List<StringBuffer> rowValues = new ArrayList<StringBuffer>();
		for (int i = 1; i < noOfRows; i++) {
			FileReader fr = new FileReader("C:\\Users\\SPK\\Desktop\\DynamicQuery.txt");
			int st;
			StringBuffer sb = new StringBuffer();
			while ((st = fr.read()) != -1) {
				sb.append((char) st);
			}
				List<String> value = (List<String>)excelMap.get(i);
				Iterator<String> itr = value.iterator();
				while (itr.hasNext()) {
					String next = (String) itr.next();
					sb.insert(sb.indexOf("?"), next);
					sb.deleteCharAt(sb.indexOf("?"));
				}
			fr.close();
			rowValues.add(sb);
		}
		FileWriter fw = new FileWriter("C:\\Users\\SPK\\Desktop\\Text1.txt");
		Writer op = new BufferedWriter(fw);
		int sz = rowValues.size();
		for(int i=0; i<sz; i++) {
			op.write(rowValues.get(i).toString()+"\n");
		}
		System.out.println("Text file created sucessfully...");
		op.close();
	}

	private static Map<Integer, List<String>> readExcel(int noOfRows, int noOfCols) throws FileNotFoundException {
		FileInputStream file = new FileInputStream(new File("C:\\Users\\SPK\\Desktop\\Remediation_demo1.xls"));
		Map<Integer, List<String>> hm = new HashMap<Integer, List<String>>();
		try {
			Workbook ReadExcel = Workbook.getWorkbook(file);
			Sheet sheet = ReadExcel.getSheet(0);
			for (int j = 1; j < noOfRows; j++) {
				List<String> cellVal = new ArrayList<String>();
				for (int i = 0; i < noOfCols; i++) {
					Cell a1 = sheet.getCell(i, j);
					String CellData = a1.getContents();
					cellVal.add(CellData);
				}
				hm.put(j, cellVal);
			}
			ReadExcel.close();
		} catch (Exception i) {
			System.out.println(i);
		}
		return hm;
	}

	private static List calcIndexOfQM(StringBuffer sb) {
		List al = new ArrayList();
		Integer index1 = sb.indexOf("?");
		al.add(index1);
		for (int i = index1; i <= sb.length() && index1 != -1;) {
			Integer indexes = sb.indexOf("?", index1 + 1);
			index1 = indexes;
			al.add(index1);
		}
		return al;
	}
}
