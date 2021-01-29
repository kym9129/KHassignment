package workshop4;

public class Test05 {

	public static void main(String[] args) {
		int data = Integer.parseInt(args[0]);
		
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i = data; i <= 10; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				continue;
			}
			else {
				sum += i;
				String str = i + "+";
				sb.append(str);
			}
		}
		System.out.println(sb.substring(0, sb.length()-1));
		System.out.println("결과: " + sum);

	}

}
