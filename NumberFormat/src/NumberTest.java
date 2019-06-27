

import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import jdk.nashorn.internal.ir.annotations.Immutable;


public class NumberTest {

	Immutable name;
	
	public  static String doubleFormat(double value) {
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.GERMANY);
		otherSymbols.setDecimalSeparator(',');
		otherSymbols.setGroupingSeparator('.'); 
		DecimalFormat decimalFormat = new DecimalFormat("###,##0.0000", otherSymbols);
			
		return decimalFormat.format(value);
	}
	
	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub

		String dS = "";
		
		//String myString = "1r0zbfwe";
		String myString = "8,258";
		double dN= 0.00;
		
		NumberFormat nf = NumberFormat.getInstance();
		double number = nf.parse(myString).doubleValue();
		
	//	System.out.println( doubleFormat(number) );
		//Double.parseDouble(dS);
		
	//	System.out.println(dS);
	//	System.out.println( doubleFormat(dN));
	//	System.out.println( doubleFormat(1.253) );
		
	//	String gome = System.getProperty("C:\\Users\\user\\Documents\\Test\\file.txt"); //, "file.txt"
		
		Field [] fields = null;// = B.class.getDeclaredFields();
		//Class<?> clazz = C.class;
		
		//ArrayList<String> list = new ArrayList<String>();
		
		HashMap<Integer, Object> map = new HashMap<Integer, Object>();
		
		int i=0;
		
		
		for(Class<?> clazz = C.class;clazz != Object.class;clazz = clazz.getSuperclass()) 
		{
			for(Field f : clazz.getDeclaredFields())     
			{
				map.put( f.getAnnotation(FileObjectBinding.class).Index() ,f.getName().toString() );
			}
		}
		/*
		do {
			fields =clazz.getDeclaredFields();
			
		} while(clazz.getSuperclass() != Object.class);
		*/
	    		
	    System.out.println(map.keySet());
	    
		for(Integer v : map.keySet()) System.out.println(map.get(v));
		
	}
		/*
		try {
			fileDo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
				
			e.printStackTrace();
		}
		}
		*/
		
		//Path p = dir.
	
	
	public static void fileDo() throws Exception {
		String path = "C:\\Users\\user\\Documents\\Test\\file2.txt";
		Path p = Paths.get(path);
		System.out.println(p.toString());
		System.out.println(p.resolve("file2.txt"));
		System.out.println(Files.exists(p));
		System.out.println(Files.isReadable(p));
		
		if(!Files.exists(p)) {
			throw new FileNotFoundException("Quelldatei: " + p + " nicht gefunden.");
		}
		if(!Files.isReadable(p)) {
			throw new Exception("Keine Leseberechtigung für Quelldatei " + p );
		}
		
	}

}
