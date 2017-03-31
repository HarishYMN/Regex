import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sample1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String local = "abcdefghijk";
//		System.out.println(local);
//		System.out.println(local.matches(""));
		
		String fileName = "textFile.txt";
		
		BufferedReader br = null;
		FileReader fr = null;
//		String pattern = ".*2008.*";
		String pattern = ".*=.*;";
		
		String str = "21#390'42&89@"; 


		
		
		try {
//			Pattern pattern = Pattern.compile("'(.*?)\"");
//			Pattern pattern1 = Pattern.compile("&(.*?)@");
			Pattern pattern1 = Pattern.compile("#(.*?)'");
			Matcher matcher = pattern1.matcher(str);
			if (matcher.find()) {
			    System.out.println(matcher.group(1));
			}			
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String line;
			br = new BufferedReader(new FileReader(fileName));
			while((line = br.readLine())!=null){
				if(line.matches(pattern)==true){
					System.out.println(line);
				}
			}
			
			
			System.out.println(br);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
