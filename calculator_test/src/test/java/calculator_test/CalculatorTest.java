package calculator_test;

public class CalculatorTest {
	Calculator calc= new Calculator();

	
	public void addtest() { 

	double num1, num2;
	num1 = 10;
	num2 = 20;
	double ExpectedResult = 30;
	assertEquals(ExpectedResult, calc.add(num1, num2),7);

}

}
