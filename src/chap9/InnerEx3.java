package chap9;
/* ����Ŭ���� ��ü���� ���Ǵ� this
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
			//this : ����Ŭ������ ��ü�� �ǹ�
			System.out.println("this.iv="+this.iv); //100
			//�ܺ�Ŭ������.this :  �ܺ�Ŭ������ ���
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
