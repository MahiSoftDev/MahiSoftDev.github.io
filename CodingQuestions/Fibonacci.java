import java.util.Scanner;
class Fibonacci{
    public static void main(String []args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter 0 to get required number of fibonacci numbers\n- choose if you want specific number of fibonacci numbers from zero \n");
    	System.out.println("Enter 1 to get  fibonacci numbers upto desired number\n- choose if you want fibonacci within a range from zero ");
    	int n0=sc.nextInt();
    	
    	int n1=0,n2=1,n3;
    	if(n0==0) {
    	System.out.println("Enter how many fibonacci numbers you want");
        	int n=sc.nextInt();
    	System.out.print("0 ,1");
    	for(int i=0;i<=n-3;i++) {
    		n3=n1+n2;
    		//n3=0+1=1
    	System.out.print(", "+n3);
    	
    		n1=n2;
    		n2=n3;
    		//n1=2 n2=3
       //n3=2+3=5
    		
    	}
    	}
    	if(n0==1) {
    		System.out.println("Enter upto which range you want fibonacci number");
    	int n4=sc.nextInt();
    	System.out.print("0");
    	for(int i=0,j=0;j<=n4;i++) {
    		n3=n1+n2;
    		//n3=0+1=1
    		n1=n2;
    		n2=n3;
    		j=n3;
    		if(n3<=n4) {
    	    	System.out.print(", "+n3);
    		}
    		//n1=2 n2=3
    	   //n3=2+3=5
    	}
    	}
    }
} 
