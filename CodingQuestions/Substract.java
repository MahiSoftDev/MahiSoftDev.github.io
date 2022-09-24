import java.util.Scanner;
class Substract{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value");
	int a=sc.nextInt();
	System.out.println("Enter b value");
	int b=sc.nextInt();
	System.out.print("Substract of "+b+" from "+a+" is ");
	System.out.println(a+(~b+1));
	sc.close();
}
}