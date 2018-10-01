import java.util.Stack;

public class PostfixEvaluator {

	public String eval (String postfix) {
		//new empty stack
		Stack <Character> operatorStack = new Stack <Character>();
		
		int index = 0;
	    int characterCount = postfix.length();
	    char nextCharacter;
	    char operandOne;
	    char operandTwo;
	    char result;
		
		//new empty stack
		Stack <Character> valueStack = new Stack <Character>();
		
		//while parsing through
		while(index < characterCount) {
			switch (nextCharacter) {
			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
				operandTwo = valueStack.pop();
				operandOne = valueStack.pop();
				result = 
				valueStack.push(result);
				break;
			default:
				break;
			}
			
		}

			
		return postfix;
	}
	
}

