package workshop5;

public class Test01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < args.length; i++) {
			sb.append(args[i]);
		}
		System.out.println(sb.reverse().toString());
		
	}

}