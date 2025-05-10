package report;

public class test {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		int temp=0;
		temp=arr[0];
		System.out.println(temp);
		temp=arr[1];
		System.out.println(temp);
		temp=arr[2];
		System.out.println(temp);
		temp=arr[3];
		System.out.println(temp);
		temp=arr[4];
		System.out.println(temp);
		
	
		
	}

}
