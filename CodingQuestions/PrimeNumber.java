import java.util.Scanner;
class PrimeNumber{
	public static void main(String []args){
	int b=1;
	do { // run the program until user choses to close it 
		System.out.println("Enter a number to check whether its Prime number ot not");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(); //take user input and assign it to a variable
		int prime=0; //assign the value 0 this will help us later in the program
		
		if (a==0 || a==1){
				System.out.println("Given number is not a Prime Number");
				prime=1;
			}else if(a==2){
				System.out.println("Given number is a Prime Number");
				prime =1;
			}else{
				for (int i=2;i<a;i++){
					if(a%i==0){
						System.out.println("Given number is not a Prime Number");
						prime=1;
						break;
					}
			}
		}
		if(prime==0){
					System.out.println("Given Number is a Prime Number");
				}
		System.out.println("\nWant to check another number ?\n To continue checking enter 1\n to exit the programm enter 0");
		String temp=sc.nextLine();
		b=sc.nextInt();
	
	}while(b==1);
}
}