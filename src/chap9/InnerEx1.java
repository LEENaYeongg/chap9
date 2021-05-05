package chap9;
/* ���� Ŭ���� ����
 * 	�ν��Ͻ� ���� Ŭ���� : Ŭ���� ����� ���� �� ����. ����� ����
 * 	static ���� Ŭ���� : Ŭ���� ����� ���� �� �ִ�.
 * 	���� ���� Ŭ���� : �޼��� ���ο��� ����� Ŭ����.
 * 				 ����� �޼��� ���ο����� ��� ����.
 * 
 * ���� Ŭ������ Ư¡
 * 1. Ŭ���� ���ο� �����ϴ� Ŭ����(��ø Ŭ����)
 * 2. �ڷ������� ����. ��üȭ ����. Object Ŭ������ ���� Ŭ����.
 * 3. �ܺ� Ŭ������ �����.
 * 		=> �ܺ� Ŭ������ private ����� ���� ����.
 * */
class Outer1 {
	class InstanceInner { //�ν��Ͻ� ���� Ŭ����
		int iv = 100;
//		static int cv = 10; //static ��� �Ұ�
		final static int MAX=200; //����� ����
	}
	static class StaticInner { //static ����Ŭ����
		int iv = 300;
		static int cv =400;
		final static int MAX=500;
	}
	void method() {
		class LocalInner { //���� ����Ŭ����
			int iv = 600;
//			static int cv = 700; //Ŭ���� ��� �Ұ�
			final static int MAX=800;
		}
		LocalInner lc = new LocalInner();
		System.out.println("local ����Ŭ���� iv���� = "+ lc.iv);
		System.out.println("local ����Ŭ���� MAX��� = "+ LocalInner.MAX);
	}
	void method2() {
		//method() �ż��� ���ο����� ��� ����
		//LocalInner lc = new LocalInner();
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.method();
//		Outer1.InstanceInner inner1 = out.new InstanceInner(); //���1
		Outer1.InstanceInner inner1 = new Outer1().new InstanceInner(); //���2
		System.out.println("InstanceInner Ŭ������ iv=" + inner1.iv);
		System.out.println("InstanceInner Ŭ������ MAX=" + inner1.MAX);
		System.out.println("InstanceInner Ŭ������ MAX=" + Outer1.InstanceInner.MAX);
		Outer1.StaticInner inner2 = new Outer1.StaticInner(); //static inner �� ���
		System.out.println("StaticInner Ŭ������ iv="+inner2.iv);
		System.out.println("StaticInner Ŭ������ cv="+Outer1.StaticInner.cv);
		System.out.println("StaticInner Ŭ������ MAX="+Outer1.StaticInner.MAX);
		if(inner1 instanceof Object) { //Object�� ���� Ŭ�����̸�
			System.out.println("inner1 ��ü�� Object ��ü��");
		}
	}
}

