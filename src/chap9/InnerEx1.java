package chap9;
/* 내부 클래스 예제
 * 	인스턴스 내부 클래스 : 클래스 멤버를 가질 수 없다. 상수는 가능
 * 	static 내부 클래스 : 클래스 멤버를 가질 수 있다.
 * 	지역 내부 클래스 : 메서드 내부에서 선언된 클래스.
 * 				 선언된 메서드 내부에서만 사용 가능.
 * 
 * 내부 클래스의 특징
 * 1. 클래스 내부에 존재하는 클래스(중첩 클래스)
 * 2. 자료형으로 사용됨. 객체화 가능. Object 클래스의 하위 클래스.
 * 3. 외부 클래스의 멤버임.
 * 		=> 외부 클래스의 private 멤버에 접근 가능.
 * */
class Outer1 {
	class InstanceInner { //인스턴스 내부 클래스
		int iv = 100;
//		static int cv = 10; //static 멤버 불가
		final static int MAX=200; //상수는 가능
	}
	static class StaticInner { //static 내부클래스
		int iv = 300;
		static int cv =400;
		final static int MAX=500;
	}
	void method() {
		class LocalInner { //지역 내부클래스
			int iv = 600;
//			static int cv = 700; //클래스 멤버 불가
			final static int MAX=800;
		}
		LocalInner lc = new LocalInner();
		System.out.println("local 내부클래스 iv변수 = "+ lc.iv);
		System.out.println("local 내부클래스 MAX상수 = "+ LocalInner.MAX);
	}
	void method2() {
		//method() 매서드 내부에서만 사용 가능
		//LocalInner lc = new LocalInner();
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.method();
//		Outer1.InstanceInner inner1 = out.new InstanceInner(); //방법1
		Outer1.InstanceInner inner1 = new Outer1().new InstanceInner(); //방법2
		System.out.println("InstanceInner 클래스의 iv=" + inner1.iv);
		System.out.println("InstanceInner 클래스의 MAX=" + inner1.MAX);
		System.out.println("InstanceInner 클래스의 MAX=" + Outer1.InstanceInner.MAX);
		Outer1.StaticInner inner2 = new Outer1.StaticInner(); //static inner 인 경우
		System.out.println("StaticInner 클래스의 iv="+inner2.iv);
		System.out.println("StaticInner 클래스의 cv="+Outer1.StaticInner.cv);
		System.out.println("StaticInner 클래스의 MAX="+Outer1.StaticInner.MAX);
		if(inner1 instanceof Object) { //Object의 하위 클래스이면
			System.out.println("inner1 객체는 Object 객체다");
		}
	}
}

