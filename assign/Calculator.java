package week1.day1.assign;

public class Calculator {
	
	public void add1(int a, int b) {
		
		int c = a+b;
		System.out.println(c);
	}
	
    public void add2(int a, int b, int c) {
		
		int d = a+b+c;
		System.out.println(d);
	}
    public void multi1(int a, int b) {
		
		int c = a*b;
		System.out.println(c);
	}
    public void multi2(int a, double b) {
		
		double c = a*b; // why need to change c dataType as double , y not int??
		System.out.println(c);
	}
    public void sub1(int a, int b) {
		
		int c = a-b;
		System.out.println(c);
	}
    
    public void sub2(double a, double b) {
		
		double c = a-b;
		System.out.println(c);
	}
    
    public void div1(int a, int b) {
		
		int c = a/b;
		System.out.println(c);
	}
    
    public void div2(double a, int b) {
		
		double c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Calculator fn = new Calculator();
		fn.add1(20, 30);
		fn.add2(20, 40, 60);
        fn.multi1(5, 3);
        fn.multi2(6, 2.56);
        fn.sub1(100, 75);
        fn.sub2(600.765, 150.564);
        fn.div1(75, 5);
        fn.div2(2765.254, 24);
	}

}
