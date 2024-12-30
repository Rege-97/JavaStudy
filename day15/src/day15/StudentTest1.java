package day15;

public class StudentTest1 {
	private String name;
	private int age;
	private String add;
	private String phone;
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private double avg;

	public StudentTest1() {
		name = "무명";
		age = 20;
		add = "대한민국";
		phone = "000-0000-0000";
		kor = 0;
		eng = 0;
		mat = 0;
		sum = 0;
		avg = 0;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getAdd() {
		return this.add;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getKor() {
		return this.kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getEng() {
		return this.eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getMat() {
		return this.mat;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getSum() {
		return this.sum;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public double getAvg() {
		return this.avg;
	}

}
