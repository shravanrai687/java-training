package daytwo;
import java.util.*;
public class DuplicateProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(2, 3, 2, 2, 5, 6, 6, 7));
		int prod = 1;
		for(int i=0; i<arr.size(); i++) {
			int key = arr.get(i);
			int j=i+1;
			int count = 0;
			while(j < arr.size()) {
				if(arr.get(j) == key) {
					if(count <= 0) {
						prod *= key;
						count++;
					}
					
					arr.remove(j);
				}else {
					j++;
				}
			}
		}
		
		for(Integer a : arr) {
			System.out.print(a + "\t");
		}
		
		System.out.println("\n" + prod);
		System.out.println("Enter the number");
		
	}

}
