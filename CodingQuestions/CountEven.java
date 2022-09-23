import java.util.Scanner;
public class CountEven {
/*get numbers from user analyze it, count and print the even numbers from user input*/
	public static void main(String []args) {
		int count=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers you want enter");
		int length=sc.nextInt();
		int array[]=new int[length];
		
		for(int i=0;i<length;i++){
			System.out.println("Enter number "+(i+1)+" :");
			array[i]=sc.nextInt();
		}
		System.out.println("even numbers:");
		for(int i=0;i<length;i++){
			if((array[i]%2)==0) {
				System.out.print(array[i]+", ");
				count=count+1;
				sum=sum+(array[i]);
			}
		}System.out.println("\nTotal count of even numbers: "+count);
		System.out.println("Sum of even numbers: "+sum);
		
			
		}
	}
