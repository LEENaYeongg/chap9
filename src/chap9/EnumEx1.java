package chap9;
/* 열거형 예제
 * */
public class EnumEx1 {
	public enum Car { //Car 열거형 객체
		AVANTE, SONATA, GRANDURE, SM5 //Car type 형으로 만들어놓은 내부객체 모임
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println(car);
		Car[] cars = Car.values();
		for(Car c : cars) {
			System.out.println(c + ":" + c.ordinal());
		}
		//car Object의 하위클래스? ==> instanceof
		if (car instanceof Object) {
			System.out.println("car 객체는 Object 객체다");
		}
	}
}
