package daytwo;

import java.util.Arrays;

public class ArrayTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp1=0,temp2=0, count =0;
		int arr1[]= {90, 78, 11, 2, 5};
		int arr2[]= {90, 82, 3, 66, 14};
		int n=arr1.length;
		int m=arr2.length;
		int arr3[]= new int[n+m];
		int k=0,i=0,j=0;
		
		for(i=0;i<arr1.length;i++) {
			int flag = 0;
			for(j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					flag = 1;
					count++;
				}
			}
			if (flag == 0) {
				arr3[k++] = arr1[i];
			}
		}
		
		for(i=0;i<arr2.length;i++) {
			int flag = 0;
			for(j=0;j<arr1.length;j++) {
				if(arr2[i]==arr1[j]) {
					flag = 1;
					count++;
				}
			}
			if (flag == 0) {
				arr3[k++] = arr2[i];
			}
		}
		
		Arrays.sort(arr3);
		int max = arr3[arr3.length - 1];
		System.out.println("Max found : " + max);
		int min = arr3[0+count];
		System.out.println("Min found : " + min);
		int result = max;
		while(min > 0) {
			result = result * 2;
			--min;
		}
		System.out.print("Result : "+result);

		
	}

}
