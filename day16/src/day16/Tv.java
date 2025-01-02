package day16;

public class Tv {

	int rgb; // 색상
	int mi; // 명암
	int ri; // 밝기

	public Tv() {
		rgb = 50;
		mi = 50;
		ri = 50;
	}

	public Tv(int rgb) {
		this();
		this.rgb = rgb;
	}

	public Tv(int rgb, int mi) {
		this(rgb);
		this.mi = mi;
	}

	public Tv(int rgb, int mi, int ri) {
		this(rgb, mi);
		this.ri = ri;
	}

	public void getInfo() {
		System.out.println("색상 : " + rgb);
		System.out.println("명암 : " + mi);
		System.out.println("밝기 : " + ri);
	}

	public void getInfo(String title) {
		System.out.println(title);
		this.getInfo();
	}

}
