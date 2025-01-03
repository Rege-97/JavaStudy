package day17;

public class GetMax extends YongMath {
	
	public int getMaxNum(int num1,int num2) {
		int max= num1>num2 ? num1:num2;
		
		return max;
	}
	public double getMaxNum(double num1,double num2) {
		double max = num1>num2 ? num1:num2;
		
		return max;
	}

}
