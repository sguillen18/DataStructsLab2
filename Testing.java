package Lab2;

public class Testing {

	public static void main(String[] args) {
		

PostfixEvaluator p = new PostfixEvaluator();
		
		String postfixTest1="233*+9-"; 
		System.out.println("The evaluation of 233*+9-");
        System.out.println(p.eval(postfixTest1)); 
        
		String postfixTest2="25-9+"; 
		System.out.println("The evaluation of 25-9+");
        System.out.println(p.eval(postfixTest2));
        
		String postfixTest3="23^"; 
		System.out.println("The evaluation of 23^");
        System.out.println(p.eval(postfixTest3));
        
        
		InfixToPostfix test = new InfixToPostfix();
		String testString1 = "a+b*c";
		String testString2 = "a+b*c)";
		String testString3 = "a+(b*c";
		String testString4 = "a^b*c";
		String testString5 = "a-b^c";
		String testString7 = "a^b-c*7";
		String testString6 = "a+(b-c)/(c-3)";
		
		
		//returns true
		System.out.println(test.checkBalance(testString1));
		//returns false
		System.out.println(test.checkBalance(testString2));
		//returns false
		System.out.println(test.checkBalance(testString3));
		System.out.println('\n');
		
		System.out.println(test.postfixIt(testString1));
		System.out.println(test.postfixIt(testString2));
		System.out.println(test.postfixIt(testString3));
		System.out.println(test.postfixIt(testString4));
		System.out.println(test.postfixIt(testString5));
		System.out.println(test.postfixIt(testString6));
		System.out.println(test.postfixIt(testString7));

	}

}
