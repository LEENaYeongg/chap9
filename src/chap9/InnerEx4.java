package chap9;
/*�̸� ���� ���� Ŭ����
 * */
interface I {
	void test();
}
public class InnerEx4 {
	public static void main(String[] args) {
		int iv = 100;
//		iv += 10; //=> ���ȭ �Ǿ����.
		System.out.println("iv="+iv);
		I i = new I() {//�̸����� ����Ŭ����. ���� �� ��������Ŭ������ ��.
			@Override
			public void test() {
				//iv���� main�޼����� ���������̰�,
				// ��������Ŭ�������� �����ϱ� ���ؼ��� ���ȭ �Ǿ�� �Ѵ�.
				System.out.println("iv="+iv);
			}
		};
		i.test();
		//���ٷ� ���� => ����Ŭ����
		i = ()->System.out.println("iv="+iv);
		i.test();
	}

}
