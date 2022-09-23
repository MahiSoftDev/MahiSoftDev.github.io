import java.util.Scanner;
public class Palindrome {
	/*a number or string that is equal to the reverse of the same 
	ex: 11, 22, 33, 1645461....
	Question : check whether given number is Palindrome or not.--> getting the number directly from user by using scanner class
	*/
	public static void main(String[] args) {
		int exit=0;
		do{ // this is just to create a loop to repeat the program 
		Scanner sc=new Scanner(System.in);
		int count=0;
		int arrayLength=0;
		System.out.println("Enter number");
		int a=sc.nextInt(); //take input from user
				if(a>=0 && a<=9) {  //if value is in between 0 and 9 it will print it as palindrome
					System.out.println("Entered number "+a+" is palindrome");
				}else if(a>9){ //if entered value is greater than 9 -->
					
					String data=String.valueOf(a);   //converts int a to String data
					char array[]=data.toCharArray();  // converts string data to characters and stores all those 
													// characters into a single array of char type
					arrayLength=array.length;		//assigns the value of length of the array to arrayLength variable	
					
				for(int i=0;i<array.length;i++) { //it will create a loop of statements which executes from 0 to whatever the 
																		//value of the array index 
					if((array[i]==(array[((array.length)-1)-i]))) {	//checks for the match suppose we type 10 numbers 
					// 												it will be --> if((array[0]==(array[((10)-1)-0] , index=length-1
							count=count+1;		//  it will add 1 value to count variable only if condition matches
						}						
				}								
				if(count==arrayLength) { //only if arrayLength and count numbers are same number is palindrome
					System.out.println("Entered Number "+a+" is palindrome");
				}else {
					System.out.println("Entered number "+a+" is not palindrome");
				}
			
}
	System.out.println("Enter 0 to continue & 1 to exit");
	exit=sc.nextInt();
	}while(exit==0);
	}
}
	