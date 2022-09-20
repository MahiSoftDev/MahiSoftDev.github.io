import java.util.Scanner;
class EvenOrOdd{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number you wish to run the check on");
		int a=sc.nextInt();
		if(a%2==0){
				System.out.println("Given Number "+a+" is Even");
		}else {
				System.out.println("Given Number "+a+" is Odd");
		}
	}
}