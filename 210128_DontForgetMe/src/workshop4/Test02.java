package workshop4;

public class Test02 {

	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int sum = 0;
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = (int)(Math.random()*10)+1;
			sum += arr3[i];
			System.out.print(arr3[i] + " ");
		}
		System.out.printf("%nsum=%d%navge=%.1f", sum, ((double)sum/(double)arr3.length));
	}

}
