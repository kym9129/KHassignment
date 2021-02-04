package workshop4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Comparator<Integer> comp = Collections.reverseOrder();
		Collections.sort(list, comp);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			
		}

	}

}
