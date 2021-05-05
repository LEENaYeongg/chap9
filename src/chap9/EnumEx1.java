package chap9;
/* ������ ����
 * */
public class EnumEx1 {
	public enum Car { //Car ������ ��ü
		AVANTE, SONATA, GRANDURE, SM5 //Car type ������ �������� ���ΰ�ü ����
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println(car);
		Car[] cars = Car.values();
		for(Car c : cars) {
			System.out.println(c + ":" + c.ordinal());
		}
		//car Object�� ����Ŭ����? ==> instanceof
		if (car instanceof Object) {
			System.out.println("car ��ü�� Object ��ü��");
		}
	}
}
