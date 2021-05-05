package chap9;
/* 내부클래스 객체에서 사용되는 this
 * 
 * */
class Outer3 {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner {
		int iv = 100;
		void method1() {
			int iv = 300;
			System.out.println("iv=" + iv); //300
			System.out.println("iv2=" +iv2);//20
			//this : 내부클래스의 객체를 의미
			System.out.println("this.iv="+this.iv); //100
			//외부클래스명.this :  외부클래스의 멤버
			System.out.println("Outer3.this.iv="+Outer3.this.iv); //10
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer3.InstanceInner inner = new Outer3().new InstanceInner();
		inner.method1();
	}
}
