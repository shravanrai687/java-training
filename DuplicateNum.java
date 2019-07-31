package daytwo;
import java.util.Scanner;
public class DuplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of an array :");
		Scanner s=new Scanner(System.in);
		int len=s.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the elements in array :");
		for(int i=0;i<len;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the number to divide");
		int num=s.nextInt();
		int prod = 1;
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			int j=i+1;
			int count = 0;
			while(j < arr.length) {
				if(arr[j] == key) {
					if(count <= 0) {
						if(arr[j] % num == 0) {
							System.out.print(arr[j] + "\t");
						}
						count++;
					}
					
					arr[j]=0;
				}
					j++;
				
			}
		}
		
		
		

	}

}
