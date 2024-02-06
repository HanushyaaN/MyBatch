package selenium;

public class Calculator implements Calci{
	
	
	 public void add()
	 {
		System.out.println(a+b);
	 }
	 public void sub()
	 {
		System.out.println(a-b);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculator  cal= new Calculator();
		//cal.add();
		//cal.sub();
		//BaseCalculator baseCal= new BaseCalculator();
		//upcasting
		//BaseCalculator basecal= new Calculator();
		//basecal.Multiple();
		//we can do method overriding
		//interface
		Calci c=new Calculator();
		c.add();
	}

}
