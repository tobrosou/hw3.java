package hw3;

public class p14 {
	public static void main(String[] args) {
		Car14 car1;
		car1 = new Car14();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}
}

class Car14
{
	int num;
	double gas;

	void setNum(int n) {
		System.out.println("車號是"+n);
	}
	void setGas(double g) {
		System.out.println("汽油量是"+g);
	}
}