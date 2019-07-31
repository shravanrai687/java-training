package daytwo;
import java.util.Scanner;
import java.util.Arrays;
public class JoinSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int arr1[]=new int[num];
		int arr2[]=new int[num];
		int arr3[]=new int[num];
		System.out.println("enter the elements in first array");
		for(int i=0;i<num;i++) {
			arr1[i]=s.nextInt();
		}
		System.out.println("enter the elements in second array");
		for(int i=0;i<num;i++) {
			arr2[i]=s.nextInt();
		}
		for(int i=0;i<num;i++) {
			int temp = arr2[i];
			int new_val = arr1[i];
			while(temp > 0) {
				new_val = new_val * 10;
				temp = temp / 10;
			}
			new_val += arr2[i];
			arr3[i] = new_val;
		}
		
		Arrays.sort(arr3);
		
		for(int a : arr3) {
			System.out.print(a + "\t");
		}

	}

}
