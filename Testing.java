package Lab2;

public class Testing {

	public static void main(String[] args) {
		

		PostfixEvaluator p = new PostfixEvaluator();
		
		String exp="231*+9-"; 
        System.out.println(p.eval(exp)); 
        
        
		InfixToPostfix test = new InfixToPostfix();
		String testString1 = "a+b*c";
		String testString2 = "a+b*c)";
		String testString3 = "a+(b*c";
		
		//returns true
		System.out.println(test.checkBalance(testString1));
		//returns false
		System.out.println(test.checkBalance(testString2));
		//returns false
		System.out.println(test.checkBalance(testString3));
		
		if(test.checkBalance(testString1)) {
			System.out.println(test.convert(testString1));
		}

	}

}
