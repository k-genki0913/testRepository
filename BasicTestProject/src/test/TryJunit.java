package test;

public class TryJunit {
	public static final String STATIC_INIT = "staticイニシャライザ";
	public static int cnt = 0;
	
	static {
		System.out.println(STATIC_INIT + "が呼ばれました");
		cnt++;
		System.out.println("カウント＝" + cnt);
	}
	
	TryJunit(){
		System.out.println("コンストラクタが呼ばれました");
		cnt++;
		System.out.println("カウント＝" + cnt);
	}
	
	public static void main(String[] args) {
		System.out.println(args[0] + args[1] + "が呼ばれました");
		cnt++;
		System.out.println("カウント＝" + cnt);
	}
	
	public int sub() {
		System.out.println("subメソッドが呼ばれました！");
		cnt++;
		System.out.println("カウント＝" + cnt);
		return cnt;
	}
}
