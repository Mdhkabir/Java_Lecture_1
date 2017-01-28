
public class IfEleseStatements {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*20);
		System.out.println(num);
		
		if (num>10)
		System.out.println("Number is Greater than 10");
		
		else if (num<10 && num>5)
			System.out.println("Between 10 and 5");
		
		else
			System.out.println("number is less than 10");
		
		
		
		

	}

}
