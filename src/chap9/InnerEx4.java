package chap9;
/*이름 없는 내부 클래스
 * */
interface I {
	void test();
}
public class InnerEx4 {
	public static void main(String[] args) {
		int iv = 100;
//		iv += 10; //=> 상수화 되어야함.
		System.out.println("iv="+iv);
		I i = new I() {//이름없는 내부클래스. 거의 다 지역내부클래스가 됨.
			@Override
			public void test() {
				//iv값은 main메서드의 지역변수이고,
				// 지역내부클래스에서 접근하기 위해서는 상수화 되어야 한다.
				System.out.println("iv="+iv);
			}
		};
		i.test();
		//람다로 변경 => 내부클래스
		i = ()->System.out.println("iv="+iv);
		i.test();
	}

}
