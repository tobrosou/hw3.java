package hw3;

public class p15 {
	public static void main(String[] args) {
		Car15 car1;
		car1 = new Car15();
		
		int num = 1234;
		double gas = 20.5;
		
		car1.setNumGas(num,gas);
	}
}

class Car15
{
	int num;
	double gas;

	void setNumGas(int n, double g) {
		System.out.println("車號是"+n+"，汽油量設為"+g);
	}
	void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}