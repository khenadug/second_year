/** 
 * @author Khena Dungu 2462068D
 */
package detectors;

import java.util.ArrayList;
import java.util.List;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.DoStmt;
import com.github.javaparser.ast.stmt.ForStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.SwitchStmt;
import com.github.javaparser.ast.stmt.WhileStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;


public class UselessControlFlowDetector extends VoidVisitorAdapter <List<Breakpoints>> {
	
	@Override
	public void visit(MethodDeclaration cf, List<Breakpoints> Bp) {
		super.visit(cf, Bp);
		
		
		}
	
	 public static  void findUselessNodes(CompilationUnit cu) {
		 List<IfStmt> ifList = cu.findAll(IfStmt.class);
	     List<ForStmt> forList = cu.findAll(ForStmt.class);
	     List<SwitchStmt> switchList = cu.findAll(SwitchStmt.class);
	     List<WhileStmt> whileList = cu.findAll(WhileStmt.class);
	     List<Node> nodeListTotal = new ArrayList<Node>();
	     nodeListTotal.addAll(ifList);
	     nodeListTotal.addAll(forList);
	     nodeListTotal.addAll(switchList);
	     nodeListTotal.addAll(whileList);
	     
		 
	 
	       
	        
	 }
	}

	
	


