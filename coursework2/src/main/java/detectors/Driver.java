/** 
 * @author Khena Dungu 2462068D
 */

package detectors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.VoidVisitor;



public class Driver {
	private static final String filePath = args[0];
	
	public static void main(String args []) {
		
		try {
			CompilationUnit cu = JavaParser.parse(new FileInputStream(filePath));
			
			VoidVisitor<?> flowVisitor = new UselessControlFlowDetector();
		
			flowVisitor.visit(cu, null);
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
