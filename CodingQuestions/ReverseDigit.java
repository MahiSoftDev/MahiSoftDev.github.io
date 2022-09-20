import java.util.Scanner;
class ReverseDigit{
	public static void main(String []args){
		
		Scanner sc=new Scanner (System.in);
		String data=sc.nextLine();
		char array[]=data.toCharArray();
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]);
		}
		sc.close();
	}
	
}