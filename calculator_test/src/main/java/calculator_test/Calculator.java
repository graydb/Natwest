package calculator_test;



	public class Calculator {
	    /**     * Adds num1 and num2 together.     *      * @param num1     * @param num2     * @return     */    public double add(double num1, double num2) {
	        return num1 + num2;
	    }
	    /**     * Subtracts num2 from num1.     * @param num1     * @param num2     * @return     */    public double subtract(double num1, double num2) {
	        return num1 - num2;
	    }
	    /**     * Divides num1 by num2. Division by zero throws an ArithmeticException.     * @throws ArithmeticException     * @param num1     * @param num2     * @return     */    public double divide(double num1, double num2) throws ArithmeticException {
	        if (num2 == 0) throw new ArithmeticException("Division by zero");
	        return num1 / num2;
	    }
	    /**     * Multiplies num1 by num2.     * @param num1     * @param num2     * @return     */    public double multiply(double num1, double num2) {
	        return num1 * num2;
	    }

}
