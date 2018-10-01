import java.util.Stack;

public class PostfixEvaluator {

	public String eval (String postfix) {

		
		int index = 0;
	    int characterCount = postfix.length();
	    char nextCharacter;
	    char operandOne;
	    char operandTwo;
	    char result;
		
		//new empty stack
		Stack <Character> valueStack = new Stack <Character>();
		
		char[] x = postfix.toCharArray();

		
		for(int i = 0; i  < characterCount; i++) {
			nextCharacter = x[i];
			valueStack.push(nextCharacter);
		}
		
		//while parsing through
		while(index < characterCount) {
			nextCharacter = x[index++];
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

