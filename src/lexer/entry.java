package lexer;
import java.io.File;
import java.io.IOException;

public class entry {

	
	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		File file = new File("./PascalCode/test.pas");
		ParseWords p = new ParseWords();
		p.doWork(file);
		
		
		
		
//		String xString = "0016";
//		System.out.println(xString.substring(2));
		
	}

}
