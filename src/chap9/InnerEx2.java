package chap9;

class Outer2 {
	private static int outeriv = 10;
	private static int outercv = 20;

	class InstanceInner {
		int iiv = outeriv;
		int iiv2 = outercv;
	}

	static class StaticInner {
		int siv = outeriv; // ���� �ذ��� ���� ��üȭ
		static int scv = outercv;
	}

	void method(int pv) {
		// pv : method(int) �޼����� ��������
		final int num = pv;
		// num+=10;
		class LocalInner {
			int liv = outeriv;
			int liv2 = outercv;

			void method() {
				// num++;
				// ��������Ŭ�������� ���Ǵ� �޼����� ���������� ���ȭ �Ǿ�� �Ѵ�.
				// ���������� ������ ���� ��쵵 ����� ����.
				// ���������� ������ �ִ� ��� ���� �߻��Ѵ�.
				System.out.println("num=" + num);
				System.out.println("pv=" + pv);
				System.out.println("liv=" + liv);
				System.out.println("liv2=" + liv2);
				System.out.println("outeriv=" + outeriv);
				System.out.println("outercv=" + outercv);
			}
		}
		LocalInner lc = new LocalInner();
//		pv++; //���������� ���ȭ�� �Ǿ����
		lc.liv++;
		lc.liv2++;
		outeriv++;
		outercv++;
		lc.method();
	}
}

public class InnerEx2 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(1);
		// InstanceInner, StaticInner Ŭ������ ��� ���� ����ϱ�
		Outer2.InstanceInner inner1 = out.new InstanceInner();
		System.out.println(inner1.iiv);
		System.out.println(inner1.iiv2);
		Outer2.StaticInner inner2 = new Outer2.StaticInner();
		System.out.println(inner2.siv);
		System.out.println(Outer2.StaticInner.scv);
	}
}
