package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExl {
	
	public  String sendUsername() 
	{
		
		File src=new File("C:\\Users\\anmol\\Desktop\\Book1.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String uname=sheet1.getRow(1).getCell(0).getStringCellValue();
	//	System.out.println(fname);
		
		
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return uname;

	}
	
	public String sendPwd() 
	{

		File src=new File("C:\\Users\\anmol\\Desktop\\Book1.xlsx");
		
		String das=null;
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
	 das=sheet1.getRow(1).getCell(1).getStringCellValue();
		//System.out.println(das);
		
		try {
			wb.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return das;
	}
/*
	public  String sendfirstname() 
	{
		
		File src=new File("C:\\Users\\anmol\\Desktop\\Book1.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String fname=sheet1.getRow(1).getCell(3).getStringCellValue();
		System.out.println(fname);
		
		
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fname;

	}
	public String sendlastname() 
	{

		File src=new File("C:\\Users\\anmol\\Desktop\\Book1.xlsx");
		
		String last=null;
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
	 last=sheet1.getRow(1).getCell(4).getStringCellValue();
		
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return last;
	}
	public String gender() 
	{
		

		File src=new File("C:\\Users\\anmol\\Desktop\\Book1.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String n=sheet1.getRow(1).getCell(2).getStringCellValue();
		
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
	public String sendDOB() 
	{
		

		File src=new File("C:\\Users\\anmol\\Desktop\\Book1.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String m=sheet1.getRow(1).getCell(5).getStringCellValue();
		System.out.println(m);
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	public String sendemail() 
	{
		

		File src=new File("C:\\Users\\anmol\\Desktop\\Book1.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String l=sheet1.getRow(1).getCell(6).getStringCellValue();
		System.out.println(l);
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	public String sendstreet() 
	{

		File src=new File("C:\\Users\\anmol\\Desktop\\Book1.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String A=sheet1.getRow(1).getCell(7).getStringCellValue();
		System.out.println(A);
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return A;
	}
	public String sendpostcode() 
	{

		File src=new File("C:\\Users\\anmol\\Desktop\\Book1.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String B=sheet1.getRow(1).getCell(8).toString();
		System.out.println(B);
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return B;
	}
	public String sendcity() 
	{

		File src=new File("C:\\Users\\anmol\\Desktop\\Book1.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String C=sheet1.getRow(1).getCell(9).getStringCellValue();
		System.out.println(C);
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return C;
	}

	public String sendstate() 
	{

		File src=new File("C:\\Users\\anmol\\Desktop\\Book1.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String D=sheet1.getRow(1).getCell(10).getStringCellValue();
		System.out.println(D);
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return D;
	}
	public String sendcountry() 
	{

		File src=new File("C:\\Users\\anmol\\Desktop\\Book1.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String E=sheet1.getRow(1).getCell(11).getStringCellValue();
		System.out.println(E);
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return E;
	}
	
	public String sendphone() 
	{
		

		File src=new File("C:\\Users\\anmol\\Desktop\\Book1.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		
		XSSFWorkbook wb = null; 
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String y=sheet1.getRow(1).getCell(12).toString();
		System.out.println(y);
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return y;
	}
	
*/
}
