/** 
 * @author Khena Dungu 2462068D
 */

package detectors;


public class Breakpoints {
	
	private String className;
	private String methodName;
	private int startLine;
	private int endLine;
	
	public Breakpoints(String className, String methodName, int startLine, int endLine) {
		
		this.className = className;
		this.methodName = methodName;
		this.startLine = startLine;
		this.endLine = endLine;
	}

	@Override
	public String toString() {
		return "className ="+ className + ", methodName=" + methodName + ", startLine=" + startLine 
				+ ", endLine="+ endLine;
	}
	
	
	
	
	
	
}
