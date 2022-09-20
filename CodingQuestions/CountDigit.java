import java.util.Scanner;
class CountDigit{
	public static void main(String []args){
		System.out.println("Enter a number to count its digits");
		Scanner sc=new Scanner (System.in);
		String data=sc.nextLine();
		System.out.println("Number of Digits in the given Number \n"+data+" is "+data.length());
	}	
}