package hw3;

public class p12 {
	public static void main(String[] args) {
		Car12 car1;
		car1 = new Car12();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showCar12();
	}
}

class Car12
{
	int num;
	double gas;

void show() {
	System.out.println("車號是"+num);
	System.out.println("汽油量是"+gas);
	}
void showCar12() {
	System.out.println("開始顯示車子資料");
	show();
	}
}